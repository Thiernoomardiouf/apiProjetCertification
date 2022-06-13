package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Livrable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}
