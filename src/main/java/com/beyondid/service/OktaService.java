package com.beyondid.service;


import com.beyondid.data.*;
import com.beyondid.utils.GlobalException;
import org.springframework.http.ResponseEntity;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Map;


public interface OktaService {

    List<OktaUsers> getAllOktaUsers();

    OktaUsers getSingleUser(String userid);
    OktaUsers saveOktaUser(Profile profile) throws GlobalException;

    OktaUsers saveOktaUserWithPassword(OktaUsers oktaUsers);

   OktaUsers saveOktaUserWithRecovery(OktaUsers oktaUsers);
   List<Question> recoveryQuestion(OktaUsers oktaUsers);
   OktaUsers saveOktaUserInGroup(OktaUsers oktaUsers);

    void activateOktaUser(String id);
    void deactivateOktaUser(String id);
   void deleteOktaUser(String id);






    OktaUsers savePassword(OktaUsers oktaUsers);
    OktaUsers saveForgetPassword(OktaUsers oktaUsers);
    OktaUsers setPassword(OktaUsers oktaUsers);
    OktaUsers saveAuthentication(OktaUsers oktaUsers);

    OktaUsers saveForgetPasswordWithSecurityAnswer(Credentials credentials,OktaUsers oktaUsers);


}
