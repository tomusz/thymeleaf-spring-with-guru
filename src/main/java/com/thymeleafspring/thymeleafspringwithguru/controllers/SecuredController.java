package com.thymeleafspring.thymeleafspringwithguru.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class SecuredController {

    @RequestMapping("/secured")
    public String returnSecured(Principal principal, Authentication authentication){
        return "secured";
    }

}
