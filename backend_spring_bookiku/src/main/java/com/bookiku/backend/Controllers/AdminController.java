package com.bookiku.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Admin;
import com.bookiku.backend.repository.AdminRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepo;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "main";
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute("admin") Admin admin, Model model, HttpSession session) {
        Admin dbAdmin = adminRepo.findByNomUtilisateur(admin.getNomUtilisateur());

        if (dbAdmin != null && dbAdmin.getMotDePasse().equals(admin.getMotDePasse())) {
            session.setAttribute("adminConnecte", dbAdmin);
            return "redirect:/emprunt/emprunts";
        } else {
            model.addAttribute("erreur", "Identifiants invalides");
            return "main";
        }
    }
}
