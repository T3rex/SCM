package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        //System.out.println("home");
        model.addAttribute("name", "Spring Boot");
        model.addAttribute("description", "Spring Boot in Action");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model){
        //System.out.println("home");
//        model.addAttribute("name", "Spring Boot");
//        model.addAttribute("description", "Spring Boot in Action");
        model.addAttribute("about","service");
        return "about";
    }

    @RequestMapping("/services")
    public String services(Model model){
        //System.out.println("home");
//        model.addAttribute("name", "Spring Boot");
//        model.addAttribute("description", "Spring Boot in Action");
        model.addAttribute("services","service");
        return "services";
    }

    @RequestMapping("/login")
    public String login(Model model){

        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model){

        return "register";
    }

    @RequestMapping("/contact")
    public String contact(Model model){

        return "contact";
    }
}
