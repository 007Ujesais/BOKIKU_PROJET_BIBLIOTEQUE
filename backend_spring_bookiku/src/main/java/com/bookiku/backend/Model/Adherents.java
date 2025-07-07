package com.bookiku.backend.Model;
// Enum pour Profil (ADHERENTS)
import jakarta.persistence.*;
import java.time.LocalDate;

enum Profil {
    Etudiant, Enseignant, Professionnel
}

@Entity
@Table(name = "ADHERENTS")
public class Adherents {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "NUM_ADHERENT", unique = true, nullable = false)
    private String numAdherent;

    @Column(name = "NOM", nullable = false)
    private String nom;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROFIL", nullable = false)
    private Profil profil;

    @Column(name = "age", nullable = false)
    private int age;

    // Constructeurs
    public Adherents() {}

    public Adherents(int id, String numAdherent, String nom, Profil profil, int age) {
        this.id = id;
        this.numAdherent = numAdherent;
        this.nom = nom;
        this.profil = profil;
        this.age = age;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(String numAdherent) {
        this.numAdherent = numAdherent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}