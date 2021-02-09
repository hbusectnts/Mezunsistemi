package com.example.mezunsistemi.controller;


import com.example.mezunsistemi.model.User;

import com.example.mezunsistemi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String getAll(Model model,Principal principal){

        User user = userService.getUserByEmail(principal.getName());

        model.addAttribute("user",user);

        return "home";
    }



}
