package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {
}
