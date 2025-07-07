package com.bookiku.backend.repository;

import com.bookiku.backend.model.Emprunts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends JpaRepository<Emprunts, Integer> {
}
