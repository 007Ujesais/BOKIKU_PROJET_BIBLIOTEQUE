package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Emprunts;
import com.bookiku.backend.repository.EmpruntRepository;

@RestController
public class EmpruntController {

    @Autowired
    private EmpruntRepository empruntRepository;

    @GetMapping("api/emprunts")
    public List<Emprunts> getAllEmprunts() {
        return empruntRepository.findAll();
    }

    @PostMapping("api/emprunts")
    public Emprunts createEmprunt(@RequestBody Emprunts emprunt) {
        return empruntRepository.save(emprunt);
    }

    @GetMapping("api/emprunts/id")
    public Emprunts getEmpruntById(@RequestParam Integer id) {
        return empruntRepository.findById(id).orElse(null);
    }
}
