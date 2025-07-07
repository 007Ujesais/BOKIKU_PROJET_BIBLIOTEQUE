package com.bookiku.backend.controllers;

import com.bookiku.backend.model.Adherents;
import com.bookiku.backend.repository.AdherentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adherents")
public class AdherentController {

    @Autowired
    private AdherentRepository adherentRepository;

    @GetMapping
    public List<Adherents> getAll() {
        return adherentRepository.findAll();
    }

    @PostMapping
    public Adherents create(@RequestBody Adherents adherent) {
        return adherentRepository.save(adherent);
    }

    @GetMapping("/{id}")
    public Adherents getById(@PathVariable Integer id) {
        return adherentRepository.findById(id).orElse(null);
    }
}
