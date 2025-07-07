package com.bookiku.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;
// Entité RESERVATIONS
@Entity
@Table(name = "RESERVATIONS")
public class Reservations {
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

    @Column(name = "DATE_RESERVATION", nullable = false)
    private LocalDate dateReservation;

    // Constructeurs
    public Reservations() {}

    public Reservations(int id, Adherents adherent, Livres livre, LocalDate dateReservation) {
        this.id = id;
        this.adherent = adherent;
        this.livre = livre;
        this.dateReservation = dateReservation;
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

    public void setAdherent(Adherents adherent) {
        this.adherent = adherent;
    }

    public Livres getLivre() {
        return livre;
    }

    public void setLivre(Livres livre) {
        this.livre = livre;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }
}