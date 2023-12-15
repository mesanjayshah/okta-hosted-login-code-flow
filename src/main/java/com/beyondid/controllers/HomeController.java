package com.beyondid.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String message(
            @AuthenticationPrincipal OidcUser user,
            Principal principal,
            Model model) {

        model.addAttribute("data", principal);

        return "okta/home";
    }
}
