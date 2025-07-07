package com.bookiku.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "LIVRES")
public class Livres {
    @Id
    @Column(name = "id")
    private Integer id;

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

    public enum Disponibilite {
        Disponible, Indisponible
    }
}