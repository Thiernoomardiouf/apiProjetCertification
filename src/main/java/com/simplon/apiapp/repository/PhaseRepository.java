package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Phase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhaseRepository extends JpaRepository<Phase, Long> {

    @Query("SELECT COUNT(id) from Phase where projet= :projet")
    Integer findByCountPhase(@Param("projet") Long projet_id);

    @Query("SELECT COUNT(id) from Phase where projet= :projet and etat_realisation= :etat ")
    Integer findByCountPhaseEtat(@Param("projet") Long projet_id, @Param("etat") boolean etat);

}
