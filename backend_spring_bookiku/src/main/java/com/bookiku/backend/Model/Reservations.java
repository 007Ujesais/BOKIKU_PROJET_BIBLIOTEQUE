package com.bookiku.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "RESERVATIONS")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "NUM_ADHERENT", nullable = false)
    private String adherent;

    @ManyToOne
    @JoinColumn(name = "Exemplaire", nullable = false)
    private String livre;

    @Column(name = "DATE_RESERVATION", nullable = false)
    private LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.EN_ATTENTE;

    // Enum for Reservations status
    public enum Status {
        EN_ATTENTE,
        VALIDER,
        REFUSER
    }

    // Constructors
    public Reservations() {}

    public Reservations(int id, String adherent, String livre, LocalDate dateReservation, Status status) {
        this.id = id;
        this.adherent = adherent;
        this.livre = livre;
        this.dateReservation = dateReservation;
        this.status = status;
    }

    // Getters and Setters
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

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}