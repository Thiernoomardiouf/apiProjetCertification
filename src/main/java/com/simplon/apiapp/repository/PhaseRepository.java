package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Phase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhaseRepository extends JpaRepository<Phase, Long> {
}
