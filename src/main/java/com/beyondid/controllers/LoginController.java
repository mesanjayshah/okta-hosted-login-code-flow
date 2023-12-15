package com.beyondid.controllers;

import com.okta.spring.boot.oauth.config.OktaOAuth2Properties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class LoginController {

    private static final String OKTA_BASE_URL = "oktaBaseUrl";
    private static final String ISSUER_URI = "issuerUri";
    private static final String OKTA_CLIENT_ID = "oktaClientId";
    private static final String REDIRECT_URI = "redirectUri";
    private static final String SCOPES = "scopes";
    private static final String STATE = "state";
    private static final String NONCE = "nonce";

    private final OktaOAuth2Properties oktaOAuth2Properties;

    public LoginController(OktaOAuth2Properties oktaOAuth2Properties) {

        this.oktaOAuth2Properties = oktaOAuth2Properties;
    }

    @GetMapping(value = "/custom-login")
    public ModelAndView login(
            @RequestParam(name = "state", required = false) String state,
            @RequestParam(name = "nonce") String nonce) throws MalformedURLException {

        // if we don't have the state parameter redirect
        if (state == null) {
            return new ModelAndView("redirect:" + oktaOAuth2Properties.getRedirectUri());
        }

        String issuer = oktaOAuth2Properties.getIssuer();
        // the widget needs the base url, just grab the root of the issuer
        String orgUrl = new URL(new URL(issuer), "/").toString();

        ModelAndView mav = new ModelAndView("okta/login");
        mav.addObject(OKTA_BASE_URL, orgUrl);
        mav.addObject(ISSUER_URI, issuer);
        mav.addObject(OKTA_CLIENT_ID, oktaOAuth2Properties.getClientId());
        // from ClientRegistration.redirectUriTemplate, if the template is changed you must update this
        mav.addObject(REDIRECT_URI, oktaOAuth2Properties.getRedirectUri());
        mav.addObject(SCOPES, oktaOAuth2Properties.getScopes());
        mav.addObject(STATE, state);
        mav.addObject(NONCE, nonce);

        return mav;
    }
}
