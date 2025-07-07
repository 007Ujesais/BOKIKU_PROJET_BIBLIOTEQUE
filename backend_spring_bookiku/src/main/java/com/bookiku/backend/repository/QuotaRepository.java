package com.bookiku.backend.repository;

import com.bookiku.backend.model.Quotas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotaRepository extends JpaRepository<Quotas, Integer> {
}
