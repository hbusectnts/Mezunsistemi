package com.example.mezunsistemi.controller;


import com.example.mezunsistemi.model.Departman;

import com.example.mezunsistemi.service.DepartmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;



import java.util.List;

@Controller
@RequestMapping("/departman")
public class DepartmentController {
    @Autowired
    private DepartmanService departmanService;

    @RequestMapping("/departmans")
    public String getAll(Model model){
        List<Departman> departmans = departmanService.listAllDepartman();

        model.addAttribute("departmans",departmans);

        return "departmanlist";
    }



}
