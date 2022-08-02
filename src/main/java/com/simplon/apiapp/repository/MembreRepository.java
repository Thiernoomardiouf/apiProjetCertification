package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
    public Membre findByUsername(String username);
    Optional<Membre> findByEmail(String email);
}
