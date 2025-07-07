package com.bookiku.backend.controllers;


import com.bookiku.backend.model.Emprunts;
import com.bookiku.backend.model.Reservations;
import com.bookiku.backend.repository.EmpruntRepository;
import com.bookiku.backend.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminDashboardController {

    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/dashboard")
    public String showDashboard(@RequestParam(defaultValue = "emprunts") String view, Model model) {
        List<Emprunts> emprunts = empruntRepository.findAll();
        List<Reservations> reservations = reservationRepository.findAll();

        model.addAttribute("emprunts", emprunts);
        model.addAttribute("reservations", reservations);
        model.addAttribute("view", view);
        model.addAttribute("nom", "Admin"); // Remplace par nom connecté si besoin

        return "admin_dashboard";
    }

 @PostMapping("/emprunts/update-status")
public String updateEmpruntStatus(@RequestParam Integer id, @RequestParam String status) {
    empruntRepository.findById(id).ifPresent(emprunt -> {
        emprunt.setStatus(Emprunts.Status.valueOf(status.toUpperCase()));
        empruntRepository.save(emprunt);
    });
    return "redirect:/admin/dashboard?view=emprunts";
}


@PostMapping("/reservations/update-status")
public String updateReservationStatus(@RequestParam Integer id, @RequestParam String status) {
    reservationRepository.findById(id).ifPresent(reservation -> {
        reservation.setStatus(Reservations.Status.valueOf(status.toUpperCase()));
        reservationRepository.save(reservation);
    });
    return "redirect:/admin/dashboard?view=reservations";
}


}
