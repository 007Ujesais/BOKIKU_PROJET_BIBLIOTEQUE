package com.bookiku.backend.repository;

import com.bookiku.backend.model.Abonnements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementRepository extends JpaRepository<Abonnements, Integer> {
}
