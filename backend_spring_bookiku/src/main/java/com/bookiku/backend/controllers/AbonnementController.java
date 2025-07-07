package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Abonnements;
import com.bookiku.backend.repository.AbonnementRepository;

@RestController
public class AbonnementController {

    @Autowired
    private AbonnementRepository abonnementRepository;

    @GetMapping("api/abonnements")
    public List<Abonnements> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @PostMapping("api/abonnements")
    public Abonnements createAbonnement(@RequestBody Abonnements abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @GetMapping("api/abonnements/id")
    public Abonnements getAbonnementById(@RequestParam Integer id) {
        return abonnementRepository.findById(id).orElse(null);
    }
}
