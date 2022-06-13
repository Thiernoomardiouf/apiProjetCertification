package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
}
