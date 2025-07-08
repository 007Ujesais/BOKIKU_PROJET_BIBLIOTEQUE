
package com.bookiku.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "EMPRUNTS")
public class Emprunts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "NUM_ADHERENT", nullable = false)
    private String adherent;

  
    @JoinColumn(name = "Exemplaire", nullable = false)
    private String livre;

    @Column(name = "DATE_EMPRUNT", nullable = false)
    private LocalDate dateEmprunt;

    @Column(name = "DATE_RETOUR_PREVUE", nullable = false)
    private LocalDate dateRetourPrevue;

    @Column(name = "DATE_RETOUR_REELLE")
    private LocalDate dateRetourReelle;

    @Column(name = "PROLONGATIONS")
    private int prolongations = 0;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.EN_ATTENTE;

    // Enum for status
    public enum Status {
        VALIDER,
        EN_ATTENTE,
        RENDU,
        REFUSER
    }

    // Constructeurs
    public Emprunts() {}

    public Emprunts(int id, String adherent, String livre, LocalDate dateEmprunt, LocalDate dateRetourPrevue, LocalDate dateRetourReelle, int prolongations, Status status) {
        this.id = id;
        this.adherent = adherent;
        this.livre = livre;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourReelle = dateRetourReelle;
        this.prolongations = prolongations;
        this.status = status;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdherent() {
        return adherent;
    }

    public void setAdherent(String adherent) {
        this.adherent = adherent;
    }

    public String getLivre() {
        return livre;
    }

    public void setLivre(String livre) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
