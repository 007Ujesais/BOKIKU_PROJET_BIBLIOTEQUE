package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Livres;
import com.bookiku.backend.repository.LivreRepository;

@RestController
public class LivreController {

    @Autowired
    private LivreRepository livreRepository;

    @GetMapping("api/livres")
    public List<Livres> getAllLivres() {
        return livreRepository.findAll();
    }

    @PostMapping("api/livres")
    public Livres createLivre(@RequestBody Livres livre) {
        return livreRepository.save(livre);
    }

    @GetMapping("api/livres/id")
    public Livres getLivreById(@RequestParam Integer id) {
        return livreRepository.findById(id).orElse(null);
    }
}
