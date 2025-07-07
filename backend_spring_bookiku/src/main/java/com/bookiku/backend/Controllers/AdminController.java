package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Admin;
import com.bookiku.backend.repository.AdminRepository;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("api/admins")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @PostMapping("api/admins")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }


}
