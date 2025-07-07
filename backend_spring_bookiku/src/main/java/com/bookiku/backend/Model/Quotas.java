package com.bookiku.backend.model;


import jakarta.persistence.*;

// Entité QUOTAS
@Entity
@Table(name = "QUOTAS")
public class Quotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "NUM_ADHERENT", nullable = false)
    private Adherents adherent;

    @Column(name = "LIVRES_EMPRUNTES", nullable = false)
    private int livresEmpruntes;

    @Column(name = "JOURS_PRET", nullable = false)
    private int joursPret;

    @Column(name = "RESERVATION_LIVRES", nullable = false)
    private int reservationLivres;

    @Column(name = "PROLONGEMENT_PRET", nullable = false)
    private int prolongementPret;

    // Constructeurs
    public Quotas() {}

    public Quotas(int id, Adherents adherent, int livresEmpruntes, int joursPret, int reservationLivres, int prolongementPret) {
        this.id = id;
        this.adherent = adherent;
        this.livresEmpruntes = livresEmpruntes;
        this.joursPret = joursPret;
        this.reservationLivres = reservationLivres;
        this.prolongementPret = prolongementPret;
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

    public int getLivresEmpruntes() {
        return livresEmpruntes;
    }

    public void setLivresEmpruntes(int livresEmpruntes) {
        this.livresEmpruntes = livresEmpruntes;
    }

    public int getJoursPret() {
        return joursPret;
    }

    public void setJoursPret(int joursPret) {
        this.joursPret = joursPret;
    }

    public int getReservationLivres() {
        return reservationLivres;
    }

    public void setReservationLivres(int reservationLivres) {
        this.reservationLivres = reservationLivres;
    }

    public int getProlongementPret() {
        return prolongementPret;
    }

    public void setProlongementPret(int prolongementPret) {
        this.prolongementPret = prolongementPret;
    }
}