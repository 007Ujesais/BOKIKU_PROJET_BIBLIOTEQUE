package com.bookiku.backend.repository;

import com.bookiku.backend.model.Adherents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdherentRepository extends JpaRepository<Adherents, Integer> {
}
