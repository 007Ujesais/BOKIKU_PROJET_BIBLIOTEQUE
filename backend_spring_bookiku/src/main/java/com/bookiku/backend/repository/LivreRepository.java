package com.bookiku.backend.repository;

import com.bookiku.backend.model.Livres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livres, Integer> {
}
