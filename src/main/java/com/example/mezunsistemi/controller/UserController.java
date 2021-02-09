package com.example.mezunsistemi.controller;

import com.example.mezunsistemi.model.Departman;
import com.example.mezunsistemi.model.User;
import com.example.mezunsistemi.service.DepartmanService;
import com.example.mezunsistemi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/student")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmanService departmanService;




    @RequestMapping("/students")
    public String studentList(Model model){
        List<User> students = userService.listAllStudent();
        model.addAttribute("student", students);
        return "studentlist";
    }
    @RequestMapping("/information")
    public String product(Model model, Principal principal){
        User user=userService.getUserByEmail(principal.getName());
        model.addAttribute("user", user);
        return "userInformation";
    }
    @RequestMapping("/addStudent")
    public ModelAndView addStudent() {

        User user = new User();
        List<Departman> departmans=departmanService.listAllDepartman();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.addObject("departman", departmans);
        modelAndView.setViewName("addStudent");

        return modelAndView;
    }

    @PostMapping( "/addStudent")
    public ModelAndView addCustomer(@Valid @ModelAttribute("user") User user,BindingResult bindingResult) {

        ModelAndView modelAndView = new ModelAndView();

        if(bindingResult.hasErrors()){

            modelAndView.setViewName("addStudent");

            return modelAndView;
        }

        modelAndView.setViewName("redirect:/");

        userService.save(user);

        return modelAndView;
    }
    @RequestMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){
        userService.deleteUser(id);
        return "redirect:/student/students";
    }




}
