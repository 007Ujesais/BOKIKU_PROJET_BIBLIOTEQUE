package com.bookiku.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookiku.backend.model.Quotas;
import com.bookiku.backend.repository.QuotaRepository;

@RestController
public class QuotaController {

    @Autowired
    private QuotaRepository quotaRepository;

    @GetMapping("api/quotas")
    public List<Quotas> getAllQuotas() {
        return quotaRepository.findAll();
    }

    @PostMapping("api/quotas")
    public Quotas createQuota(@RequestBody Quotas quota) {
        return quotaRepository.save(quota);
    }

    @GetMapping("api/quotas/id")
    public Quotas getQuotaById(@RequestParam Integer id) {
        return quotaRepository.findById(id).orElse(null);
    }
}
