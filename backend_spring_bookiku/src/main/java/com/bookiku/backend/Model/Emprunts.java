package com.bookiku.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

// Entité EMPRUNTS
@Entity
@Table(name = "EMPRUNTS")
public class Emprunts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "NUM_ADHERENT", nullable = false)
    private Adherents adherent;

    @ManyToOne
    @JoinColumn(name = "Exemplaire", nullable = false)
    private Livres livre;

    @Column(name = "DATE_EMPRUNT", nullable = false)
    private LocalDate dateEmprunt;

    @Column(name = "DATE_RETOUR_PREVUE", nullable = false)
    private LocalDate dateRetourPrevue;

    @Column(name = "DATE_RETOUR_REELLE")
    private LocalDate dateRetourReelle;

    @Column(name = "PROLONGATIONS")
    private int prolongations = 0;

    // Constructeurs
    public Emprunts() {}

    public Emprunts(int id, Adherents adherent, Livres livre, LocalDate dateEmprunt, LocalDate dateRetourPrevue, LocalDate dateRetourReelle, int prolongations) {
        this.id = id;
        this.adherent = adherent;
        this.livre = livre;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourReelle = dateRetourReelle;
        this.prolongations = prolongations;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adherents getAdherent() {
        return adherent;
    }

    public void setAdherents(Adherents adherent) {
        this.adherent = adherent;
    }

    public Livres getLivre() {
        return livre;
    }

    public void setLivre(Livres livre) {
        this.livre = livre;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(LocalDate dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public LocalDate getDateRetourReelle() {
        return dateRetourReelle;
    }

    public void setDateRetourReelle(LocalDate dateRetourReelle) {
        this.dateRetourReelle = dateRetourReelle;
    }

    public int getProlongations() {
        return prolongations;
    }

    public void setProlongations(int prolongations) {
        this.prolongations = prolongations;
    }
}

