package com.bookiku.backend.repository;

import com.bookiku.backend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByNomUtilisateur(String nomUtilisateur);
}
