package com.beyondid.controllers;
import com.beyondid.data.*;
import com.beyondid.service.OktaService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import com.beyondid.utils.OktaConfigurationProperties;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.naming.AuthenticationException;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/okta")
public class OktaServiceController {
    @Autowired
    OktaService oktaService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OktaServiceController.class);

    //for all user details
    @GetMapping("/userList")
    public String userList(Model model) {
        if(LOGGER.isInfoEnabled()) {
            LOGGER.info("The is the okta list view logger");
        }
        List<OktaUsers> oktaUsersList = oktaService.getAllOktaUsers();
        model.addAttribute("oktaUsersList", oktaUsersList);
        return "oktas/userList";
    }
//for single user details
    @GetMapping("/singleUser")
    public String singleUser(@RequestParam String id, Model model) {
        LOGGER.info("Get single user detail" + id);
        OktaUsers oktaUsers = oktaService.getSingleUser(id);
        System.out.println(oktaUsers);
        model.addAttribute("oktaUsers", oktaUsers);
        return "oktas/userDetail";
    }


//for adding user without credentials
    @GetMapping("/addOktaUserForm")
    public String addOktaUserForm(Model model) {
        LOGGER.info("Okta user submit loader");
        Profile profile = new Profile();
        model.addAttribute("profile", profile);
        return "oktas/addUser";

    }
    @PostMapping("/saveOktaUser")
    public String saveOktaUser(@ModelAttribute("profile") Profile profile,BindingResult bindingResult) {
        LOGGER.info("Okta user submit form handler" + profile);
        OktaUsers oktaUsers = oktaService.saveOktaUser(profile);
        return "redirect:/okta/userList";
    }
    //for adding user with credentials
    @GetMapping("/addOktaUserFormWithPassword")
    public String addOktaUserFormWithPassword(OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit loader");
        return "oktas/addUserswithpassword";
    }

    @PostMapping("/saveOktaUserWithPassword")
    public String saveOktaUserWithPassword(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.saveOktaUserWithPassword(oktaUsers);
        return "redirect:/okta/userList";
    }

//for creating user with recovery question
    @GetMapping("/addOktaUserFormWithRecovery")
    public String addOktaUserFormWithRecovery(OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit loader");
        return "oktas/addUserswithRecovery";
    }
    @PostMapping("/saveOktaUserWithRecovery")
    public String saveOktaUserWithRecovery(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.saveOktaUserWithRecovery(oktaUsers);
        System.out.println(oktaUser);
        return "redirect:/okta/userList";
    }
    //to add user in grp
    @GetMapping("/addOktaUserFormInGroups")
    public String addOktaUserFormInGroups(OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit loader");
        return "oktas/addUsersinGroups";
    }
    @PostMapping("/saveOktaUserFormInGroups")
    public String saveOktaUserInGroups(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.saveOktaUserInGroup(oktaUsers);
        System.out.println(oktaUser);
        return "redirect:/okta/userList";
    }
    //for activate user

    @GetMapping("/activateOktaUser")
    public String activateOktaUser(@RequestParam String id) {
        LOGGER.info("Activate okta user" + id);
        oktaService.activateOktaUser(id);
        return "redirect:/okta/userList";

    }
    //for deactivate
    @GetMapping("/deactivateOktaUser")
    public String deactivateOktaUser(@RequestParam String id) {
        LOGGER.info("Deactivate okta user" + id);
        oktaService.deactivateOktaUser(id);
        return "redirect:/okta/userList";
    }

    //for deleting user
    @GetMapping("/deleteOktaUser")
    public String deleteOktaUser(@RequestParam String id) {
        LOGGER.info("Delete okta user" + id);
        oktaService.deleteOktaUser(id);
        return "redirect:/okta/userList";
    }

    //for recovery question from the list
    @GetMapping("/recoveryQuestion")
    public String getRecoveryQuestion(@ModelAttribute("question") Question question, OktaUsers oktaUsers, Model model) {
//

        List<OktaUsers> oktaUsersList = oktaService.getAllOktaUsers();
        model.addAttribute("oktaUsersList",oktaUsersList);
//        model.addAttribute("Question question",oktaService.recoveryQuestion(oktaUsers.getId()));
        System.out.println("oktaUsersssss..........................."+oktaService.recoveryQuestion(oktaUsers));
//        model.addAttribute("question",oktaService.recoveryQuestion(oktaUsers.getId()));
        model.addAttribute("",oktaService.recoveryQuestion(oktaUsers));
        List<Question> n= oktaService.recoveryQuestion(oktaUsers);
        System.out.println("nis...."+n);
        model.addAttribute("question",n);
        model.addAttribute("oktaUsers",oktaUsers );

        return "oktas/recoveryQuestion";
    }

    @PostMapping("/saveOktaUserWithRecoveryQuestion")
    public String saveOktaUserWithRecoveryQuestion(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
//        List<Question> oktaUser= oktaService.recoveryQuestion(oktaUsers.getId());
//        System.out.println(oktaUser);
        System.out.println(oktaUsers);
        return "redirect:/okta/userList";
    }

    @GetMapping("/addPassword")
    public String addPassword(OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit loader");
        return "oktas/addPassword";
    }
    @PostMapping("/savePassword")
    public String savePassword(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.setPassword(oktaUsers);
        System.out.println(oktaUser);
        return "redirect:/okta/userList";
    }

    @GetMapping("/addOktaUserFormWithResetPassword")
    public String addOktaUserFormWithResetPassword(OktaUsers oktaUsers) {

        LOGGER.info("Okta user submit loader");
        OktaUsers oktaUser = oktaService.saveForgetPassword(oktaUsers);
        return "oktas/forgetPassword";
    }
    @PostMapping("/saveOktaUserWithResetPassword")
    public String saveOktaUserWithResetPassword(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.saveForgetPassword(oktaUsers);
        System.out.println(oktaUser);
        return "redirect:/okta/userList";
    }

    @GetMapping("/addAuthentication")
    public String addAuthentication(OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit loader");
        return "oktas/authentication";
    }
    @PostMapping("/saveAuthentication")
    public String saveAuthentication(@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
        LOGGER.info("Okta user submit form handler" + oktaUsers);
        OktaUsers oktaUser = oktaService.saveAuthentication(oktaUsers);
        System.out.println(oktaUser);
        System.out.println("oktatoken "+oktaUser.stateToken);
        return "redirect:/okta/userList";
    }
    @GetMapping("/addforgetPasswordWithSecurityAnswer")
    public String addforgetPasswordWithSecurityAnswer(OktaUsers oktaUsers,Credentials credentials) {
        LOGGER.info("Okta user submit loader");
//        OktaUsers oktaUser= oktaService.saveForgetPasswordWithSecurityAnswer(credentials,oktaUsers);
//        saveForgetPasswordWithSecurityAnswer(credentials,oktaUsers);
//        model.addAttribute("oktaUsers",oktaUsers);
        return "oktas/forgetPassword";
    }
  
//    @GetMapping("/userid")
//    public String userid(OktaUsers oktaUsers, Model model){
//        model.addAttribute("")
//        return oktaUsers.id;
//    }
/*    @PostMapping("/saveForgetPasswordWithSecurityAnswer")
    public String saveForgetPasswordWithSecurityAnswer( @ModelAttribute("credentials") Credentials credentials,@ModelAttribute("oktaUser") OktaUsers oktaUsers) {
//
        String id= userid(oktaUsers);
        System.out.println("iiiiiiiiiiiiiiiid"+id);

        LOGGER.info("Okta user submit form handler" + oktaUsers);
       OktaUsers oktaUser= oktaService.saveForgetPasswordWithSecurityAnswer(credentials,oktaUsers);

        return "redirect:/okta/userList";
    }*/







}

