package com.bookiku.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;
enum ValiditeAbonnement {
    OK, KO
}

// Entité ABONNEMENTS
@Entity
@Table(name = "ABONNEMENTS")
public class Abonnements {
    @Id
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "NUM_ADHERENT", nullable = false)
    private String adherent;

    @Column(name = "DATE_DEBUT", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "DATE_FIN", nullable = false)
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    @Column(name = "VALIDITE_ABONNEMENT", nullable = false)
    private ValiditeAbonnement validiteAbonnement;

    // Constructeurs
    public Abonnements() {}

    public Abonnements(int id, String adherent, LocalDate dateDebut, LocalDate dateFin, ValiditeAbonnement validiteAbonnement) {
        this.id = id;
        this.adherent = adherent;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.validiteAbonnement = validiteAbonnement;
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

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public ValiditeAbonnement getValiditeAbonnement() {
        return validiteAbonnement;
    }

    public void setValiditeAbonnement(ValiditeAbonnement validiteAbonnement) {
        this.validiteAbonnement = validiteAbonnement;
    }
}