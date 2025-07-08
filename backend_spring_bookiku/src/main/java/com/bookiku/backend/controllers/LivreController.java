package com.bookiku.backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Livres;
import com.bookiku.backend.repository.LivreRepository;

@CrossOrigin(origins = "http://localhost:5173") // remplace par ton port Vite
@RestController
@RequestMapping("/api/livres") 
public class LivreController {

    @Autowired
    private LivreRepository livreRepository;

    @GetMapping
    public List<Livres> getAllLivres() {
    try {
        return livreRepository.findAll();
    } catch (Exception e) {
        System.err.println("Erreur lors du chargement des livres : " + e.getMessage());
        e.printStackTrace();
        return new ArrayList<>();
    }
}

    @PostMapping
    public Livres createLivre(@RequestBody Livres livre) {
        return livreRepository.save(livre);
    }

}
