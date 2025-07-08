package com.bookiku.backend.repository;

import com.bookiku.backend.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservations, Integer> {
    
}
