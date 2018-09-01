package com.thymeleafspring.thymeleafspringwithguru.controllers;

import com.thymeleafspring.thymeleafspringwithguru.comnds.LoginCommand;
import com.thymeleafspring.thymeleafspringwithguru.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model){

        model.addAttribute("loginCommand",new LoginCommand());

        return "/loginform";
    }

    @RequestMapping(value = "/dologinform", method = RequestMethod.POST)
    public String odCheckout(@Valid LoginCommand loginCommand, BindingResult bindingResult,Model model) {

        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:/";

    }

}
