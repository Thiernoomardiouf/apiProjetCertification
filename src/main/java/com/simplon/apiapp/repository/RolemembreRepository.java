package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Rolesmembre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolemembreRepository extends JpaRepository<Rolesmembre, Long> {

}
