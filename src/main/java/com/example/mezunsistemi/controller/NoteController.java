package com.example.mezunsistemi.controller;

import com.example.mezunsistemi.model.Lesson;
import com.example.mezunsistemi.model.Note;

import com.example.mezunsistemi.model.User;

import com.example.mezunsistemi.service.LessonService;
import com.example.mezunsistemi.service.NoteService;

import com.example.mezunsistemi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private UserService userService;
    @Autowired
    private NoteService noteService;
    @Autowired
    private LessonService lessonService;

    @RequestMapping("/notes")
    public String product(Model model, Principal principal){
        User user=userService.getUserByEmail(principal.getName());
        List<Note> notes = noteService.notesByUser(user);
        model.addAttribute("notes", notes);

        return "notes";
    }
    @RequestMapping("/notes/{id}")
    public String notes(@PathVariable("id") Long id,Model model){
        User user=userService.getById(id);

        List<Note> notes = noteService.notesByUser(user);

        model.addAttribute("notes", notes);

        return "notes";
    }
    @RequestMapping("/addNotes/{id}")
    public String addNotes(@PathVariable Long id,Model model){
        User user=userService.getById(id);

        List<Lesson> lessons=lessonService.getAllLessons();
        Note note=new Note();

        model.addAttribute("user", user);
        model.addAttribute("note", note);
        model.addAttribute("lessons", lessons);
        return "addNote";
    }
    @PostMapping("/addNotes/{id}")
    public String addNotess(@PathVariable Long id,@ModelAttribute("note") Note note,Model model, BindingResult bindingResult){
       if(bindingResult.hasErrors()){
           List<Lesson> lessons=lessonService.getAllLessons();
           model.addAttribute("lessons", lessons);

            return "addNote";
        }


        User user=userService.getById(id);
        note.setUser(user);
        noteService.save(note);

        return "home";

    }





}
