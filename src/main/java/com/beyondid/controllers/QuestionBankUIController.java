package com.beyondid.controllers;
//

import com.beyondid.data.Category;
import com.beyondid.data.QuestionAnswers;
import com.beyondid.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import java.util.Map;

@Controller
public class QuestionBankUIController {
    @Autowired
    private QuestionBankService questionBankService;




//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
    @GetMapping("/category")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", questionBankService.fetchAllCategories());
        return "okta/category";
    }

    @GetMapping("/questions")
    public String showAllQuestions(Model model) {
        model.addAttribute("questions", questionBankService.fetchAllQuestionsAndAnswers());
        return "okta/questions";
    }
    @PostMapping("/category/add")
    public String addCategory(Model model){
        model.addAttribute("category", new Category());
        return "okta/addCategory";
    }

    @PostMapping("/questions/add")
    public String addQuestion(Model model){
        model.addAttribute("qn", new QuestionAnswers());
        model.addAttribute("categories", questionBankService.fetchAllCategories());
        return "okta/addQuestion";
    }
    @PostMapping("/category/save")
    public String saveCategory(@ModelAttribute("category")Category category){
        //save data to Db and redirect to the category page
        questionBankService.saveCategory(category);
        return "redirect:okta/category";
    }
    @PostMapping("/questions/save")
    public String saveQuestion(@ModelAttribute("qn")QuestionAnswers question){
        questionBankService.saveQuestion(question);
        return "redirect:okta/questions";
    }
    @PostMapping("/category/edit")
    public String editCategory(@RequestParam("categoryId")String categoryId, Model model){
        model.addAttribute("category", questionBankService.fetchCategory(categoryId));
        return "okta/editCategory";
    }
////
    @PostMapping("/questions/edit")
    public String editQuestion(@RequestParam("questionId")String questionId, Model model){
        model.addAttribute("qn", questionBankService.fetchQuestionAnswer(questionId));
        model.addAttribute("categories", questionBankService.fetchAllCategories());
        return "okta/editQuestion";
    }
//
    @PostMapping("/category/delete")
    public String deleteCategory(@RequestParam("categoryId")String categoryId){
        questionBankService.deleteCategory(categoryId);
        return "redirect:okta/category";
    }

    @PostMapping("/questions/delete")
    public String deleteQuestion(@RequestParam("questionId")String questionId){
        questionBankService.deleteQuestion(questionId);
        return "redirect:okta/questions";
    }
//
//    @RequestMapping("/oauthinfo")
//    @ResponseBody
//    public String oauthUserInfo(@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
//                                @AuthenticationPrincipal OAuth2User oauth2User) {
//        return
//                "User Name: " + oauth2User.getName() + "<br/>" +
//                        "User Authorities: " + oauth2User.getAuthorities() + "<br/>" +
//                        "Client Name: " + authorizedClient.getClientRegistration().getClientName() + "<br/>" +
//                        this.prettyPrintAttributes(oauth2User.getAttributes());
//    }
//
//    private String prettyPrintAttributes(Map<String, Object> attributes) {
//        String acc = "User Attributes: <br/><div style='padding-left:20px'>";
//        for (String key : attributes.keySet()){
//            Object value = attributes.get(key);
//            acc += "<div>"+key + ":&nbsp" + value.toString() + "</div>";
//        }
//        return acc + "</div>";
//    }
//
}
