package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
}
