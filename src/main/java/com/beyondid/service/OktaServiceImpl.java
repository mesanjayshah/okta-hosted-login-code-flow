package com.beyondid.service;

import com.beyondid.data.*;
import com.beyondid.utils.GlobalException;
import com.beyondid.utils.OktaConfigurationProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class OktaServiceImpl implements OktaService {

    @Autowired
    OktaConfigurationProperties oktaConfigurationProperties;

    @Autowired
    RestTemplate restTemplate;


    @Override
    public List<OktaUsers> getAllOktaUsers() {
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?limit=68";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<List<OktaUsers>> responseEntity = restTemplate.exchange(oktaurl, HttpMethod.GET,
                entity, new ParameterizedTypeReference<List<OktaUsers>>() {
                });
        return responseEntity.getBody();
    }

    @Override
    public OktaUsers getSingleUser(String userid) {
        String url = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + userid;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<OktaUsers>() {
        });
        return responseEntity.getBody();
    }

    @Override
    public OktaUsers saveOktaUser(Profile profile) throws GlobalException {

        ResponseEntity<Map<String, Object>> userWithLogin = getUserWithLogin(profile.getEmail());

        if (userWithLogin != null) {
            throw new GlobalException("User already exists.", null);
        }
//        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?activate=false";
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?activate="+profile.isVal();


        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();


        pro.put("firstName", profile.getFirstName());
        pro.put("lastName", profile.getLastName());
        pro.put("email", profile.getEmail());
        pro.put("login", profile.getLogin());
        json.put("profile", pro);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUsers = responseEntity.getBody();
        System.out.println("oktaUsers" + oktaUsers);
        return oktaUsers;

    }



    private ResponseEntity<Map<String, Object>> getUserWithLogin(String email) {
//        https://${yourOktaDomain}/api/v1/users/isaac.brock%40example.com

        String oktaUrl1 = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + email;
        HttpHeaders headers1 = new HttpHeaders();
        headers1.add("Accept", "application/json");
        headers1.add("Content-Type", "application/json");
        headers1.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers1.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity1 = new HttpEntity<String>(null, headers1);
        ResponseEntity<Map<String, Object>> responseEntity1;
        try {
            return responseEntity1 = restTemplate.exchange(oktaUrl1,
                    HttpMethod.GET, entity1, new ParameterizedTypeReference<Map<String, Object>>() {
                    });
        } catch (HttpClientErrorException e) {
            return null;
        }
    }

    @Override
    public void activateOktaUser(String id) {
        String url = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + id + "/lifecycle/activate?sendEmail=false";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }


    @Override
    public void deactivateOktaUser(String id) {
        String url = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + id + "/lifecycle/deactivate";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }

    @Override
    public void deleteOktaUser(String id) {
        String url = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        restTemplate.exchange(url, HttpMethod.DELETE, entity, String.class);
    }

@Override
    public OktaUsers saveForgetPassword(OktaUsers oktaUsers){
        String oktaurl=oktaConfigurationProperties.getOrgUrl()+"/api/v1/users/"+oktaUsers.id+"/credentials/forgot_password?sendEmail=false";
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
        pro.put("password", oktaUsers.getCredentials().getPassword());
        pro.put("answer", oktaUsers.getCredentials().getRecovery_question().getAnswer());

        json.put("credentials", pro);


        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser" + oktaUser);
        return oktaUser;
    }

    @Override
    public OktaUsers setPassword(OktaUsers oktaUsers) {
        String oktaurl=oktaConfigurationProperties.getOrgUrl()+"api/v1/users/"+ oktaUsers.getId();
        System.out.println("url%%%%%%%%is"+oktaurl);
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        pro.put("password",oktaUsers.getCredentials().getPassword());
        json.put("credentials",pro);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser" + oktaUser);
        return oktaUser;
    }

    @Override
    public OktaUsers saveOktaUserWithPassword(OktaUsers oktaUsers) {
//        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?activate=false";
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?activate="+oktaUsers.getProfile().isVal();
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
        pro.put("firstName", oktaUsers.getProfile().getFirstName());
        pro.put("lastName", oktaUsers.getProfile().getLastName());
        pro.put("email", oktaUsers.getProfile().getEmail());
        pro.put("login", oktaUsers.getProfile().getLogin());
        json.put("profile", pro);
        pros.put("password", oktaUsers.getCredentials().getPassword());
        json.put("credentials", pros);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser" + oktaUser);
        return oktaUser;
    }

    @Override
    public OktaUsers saveOktaUserWithRecovery(OktaUsers oktaUsers) {
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users?activate="+oktaUsers.getProfile().isVal();
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
        JSONObject pr = new JSONObject();
        pro.put("firstName", oktaUsers.getProfile().getFirstName());
        pro.put("lastName", oktaUsers.getProfile().getLastName());
        pro.put("email", oktaUsers.getProfile().getEmail());
        pro.put("login", oktaUsers.getProfile().getLogin());

        json.put("profile", pro);

        Map<String, Object> pass = new HashMap<>();
        pass.put("value",oktaUsers.getCredentials().getPassword().getValue());
        pros.put("password", pass);

        Map<String, Object> map = new HashMap<>();
        map.put("question",oktaUsers.getCredentials().getRecovery_question().getQuestion());
        map.put("answer", oktaUsers.getCredentials().getRecovery_question().getAnswer());
        pros.put("recovery_question",map);

//        pros.put("recovery_question",oktaUsers.getCredentials().getRecovery_question().getQuestion());

//        pros.put("answer", oktaUsers.getCredentials().getRecovery_question().getAnswer());


        json.put("credentials", pros);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser.........................................." + oktaUser);

        return oktaUser;
    }

    @Override
    public OktaUsers savePassword(OktaUsers oktaUsers) {
        String oktaurl=oktaConfigurationProperties.getOrgUrl()+"/api/v1/users/"+oktaUsers.id;
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        pro.put("password",oktaUsers.getCredentials().getPassword());
        json.put("credentials",pro);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS" + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser.........................................." + oktaUser);
        return oktaUser;
    }


    @Override
    public List<Question> recoveryQuestion(OktaUsers oktaUsers) {
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/users/" + oktaUsers.id+ "/factors/questions";
        System.out.println("OOOOO"+oktaurl);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS" + oktaConfigurationProperties.getToken());
        HttpEntity<Object> entity = new HttpEntity<Object>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(oktaurl, HttpMethod.GET,
                entity, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Question> c = objectMapper.readValue(responseEntity.getBody(), List.class);
//            System.out.println("The countries are: " + c);
            List<Question> oktaUserss = c;
            System.out.println("oktsdha"+oktaUserss);
            return oktaUserss;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public OktaUsers saveOktaUserInGroup(OktaUsers oktaUsers) {
        String oktaurl=oktaConfigurationProperties.getOrgUrl()+"api/v1/users?activate=false";
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
        pro.put("firstName", oktaUsers.getProfile().getFirstName());
        pro.put("lastName", oktaUsers.getProfile().getLastName());
        pro.put("email", oktaUsers.getProfile().getEmail());
        pro.put("login", oktaUsers.getProfile().getLogin());
        json.put("profile", pro);
        json.put("groupIds",oktaUsers.getGroupIds());
//        json.put("groupIds",pros);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser.........................................." + oktaUser);
        return oktaUser;


    }


//new ParameterizedTypeReference<Map<String, Object>>


    @Override
    public OktaUsers saveAuthentication(OktaUsers oktaUsers){
        String oktaurl = oktaConfigurationProperties.getOrgUrl() + "api/v1/authn";
        JSONObject json = new JSONObject();
        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
//        JSONObject pr = new JSONObject();
        pro.put("username", oktaUsers.getUsername());
//        json.put("username", pro);
        pro.put("password", oktaUsers.getPassword());
//        json.put("password", pro);
        pro.put("oktaUsers",oktaUsers);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(pro.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaurl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        System.out.println("responseEntity=================="+responseEntity);
        System.out.println("responseEntity.getBody()============"+responseEntity.getBody());
        ResponseEntity<OktaUsers> responseEntity1 = restTemplate.exchange(oktaurl,
                HttpMethod.GET, entity, new ParameterizedTypeReference<OktaUsers>() {
                });
        System.out.println("++++++++++++++++++++++++++"+responseEntity1.getBody());

        OktaUsers oktaUser = responseEntity.getBody();
        OktaUsers oktaUser1 = responseEntity1.getBody();

//        System.out.println("heloooo"+oktaUser.get(saveAuthentication(oktaUsers)));

//        System.out.println("oktaUser.........................................." );
        return oktaUser;

    }




    // TODO: 1/30/2023  
    @Override
    public OktaUsers saveForgetPasswordWithSecurityAnswer(Credentials credentials, OktaUsers oktaUsers) {

        System.out.println("oktaUsers() -> " + oktaUsers.toString());
        System.out.println("oktaUsers.getId() -> " + oktaUsers.getId());

        String oktaUrl=oktaConfigurationProperties.getOrgUrl()+"/api/v1/users/"+oktaUsers.getId() + "/credentials/forgot_password?sendEmail=false";
//        String oktaUrls=oktaConfigurationProperties.getOrgUrl()+"/api/v1/users/"+oktaUsers.id+"/credentials/forgot_password?sendEmail=false";

        System.out.println("oktaurl________"+oktaUrl);
        JSONObject json = new JSONObject();
//        JSONObject pro = new JSONObject();
        JSONObject pros = new JSONObject();
        pros.put("value", credentials.getPassword().getValue());
        json.put("password",pros);
//        json.put("credentials",pro);
        pros.put("answer", credentials.getRecovery_question().getAnswer());
        json.put("recovery_question",pros);
//        json.put("credentials", pro);



//        json.put("groupIds",pros);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "SSWS " + oktaConfigurationProperties.getToken());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(json.toString(), headers);
        ResponseEntity<OktaUsers> responseEntity = restTemplate.exchange(oktaUrl,
                HttpMethod.POST, entity, new ParameterizedTypeReference<OktaUsers>() {
                });

        OktaUsers oktaUser = responseEntity.getBody();
        System.out.println("oktaUser.........................................." + oktaUser);


        return oktaUser;



    }



}
