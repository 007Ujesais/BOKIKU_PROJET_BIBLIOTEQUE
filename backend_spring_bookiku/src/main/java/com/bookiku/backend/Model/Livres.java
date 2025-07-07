package com.bookiku.backend.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

// Enum pour Disponibilite (LIVRES)
enum Disponibilite {
    Disponible, Indisponible
}

// Entité LIVRES
@Entity
@Table(name = "LIVRES")
public class Livres {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "Titre", nullable = false)
    private String titre;

    @Column(name = "Auteur", nullable = false)
    private String auteur;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "Categorie")
    private String categorie;

    @Column(name = "Langue")
    private String langue;

    @Column(name = "Exemplaire", unique = true)
    private String exemplaire;

    @Enumerated(EnumType.STRING)
    @Column(name = "Disponibilite", nullable = false)
    private Disponibilite disponibilite;

    // Constructeurs
    public Livres() {}

    public Livres(int id, String titre, String auteur, String isbn, String categorie, String langue, String exemplaire, Disponibilite disponibilite) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.categorie = categorie;
        this.langue = langue;
        this.exemplaire = exemplaire;
        this.disponibilite = disponibilite;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(String exemplaire) {
        this.exemplaire = exemplaire;
    }

    public Disponibilite getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Disponibilite disponibilite) {
        this.disponibilite = disponibilite;
    }
}