package com.thymeleafspring.thymeleafspringwithguru.controllers;

import com.thymeleafspring.thymeleafspringwithguru.comnds.CheckoutCommand;
import com.thymeleafspring.thymeleafspringwithguru.comnds.LoginCommand;
import com.thymeleafspring.thymeleafspringwithguru.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/login")
    public String login(Model model){

        model.addAttribute("loginCommand",new LoginCommand());

        return "/loginform";
    }

    @RequestMapping(value = "/dologinform")
    public String odCheckout(@Valid LoginCommand loginCommand, BindingResult bindingResult,Model model) {

        model.addAttribute("products",productService.listProduct());

        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "index";

    }

}
