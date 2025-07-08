package com.bookiku.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bookiku.backend.model.Admin;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcomeAdmin(Model model) {
        model.addAttribute("admin", new Admin());
        return "main";
    }
}
