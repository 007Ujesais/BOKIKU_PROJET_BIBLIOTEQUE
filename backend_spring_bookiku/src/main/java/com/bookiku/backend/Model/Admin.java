package com.bookiku.backend.model;


import jakarta.persistence.*;

@Entity
@Table(name = "ADMINS")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private int idAdmin;

    @Column(name = "nom_utilisateur", length = 50, nullable = false)
    private String nomUtilisateur;

    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;

    // Constructeurs
    public Admin() {}

    public Admin(int idAdmin, String nomUtilisateur, String motDePasse) {
        this.idAdmin = idAdmin;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
    }

    // Getters et Setters
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
