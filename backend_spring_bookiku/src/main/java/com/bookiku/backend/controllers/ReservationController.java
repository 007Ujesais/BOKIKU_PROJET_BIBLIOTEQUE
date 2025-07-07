package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Reservations;
import com.bookiku.backend.repository.ReservationRepository;

@RestController
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("api/reservations")
    public List<Reservations> getAllReservations() {
        return reservationRepository.findAll();
    }

    @PostMapping("api/reservations")
    public Reservations createReservation(@RequestBody Reservations reservation) {
        return reservationRepository.save(reservation);
    }

    @GetMapping("api/reservations/id")
    public Reservations getReservationById(@RequestParam Integer id) {
        return reservationRepository.findById(id).orElse(null);
    }
}
