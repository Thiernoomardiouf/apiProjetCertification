package com.simplon.apiapp.repository;

import com.simplon.apiapp.model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
    Projet findByCode(String code);

    @Query("SELECT p from Projet p where code= :code")
    List<Projet> findByCustonQuery(@Param("code") String p);

    @Query(value = "SELECT * from Projet where nom= :nom", nativeQuery = true)
    List<Projet> findByCustonNativeQuery(@Param("nom") String p);

    List<Projet> findByCodeIgnoreCaseAndNomIgnoreCase(String code, String nom);

    @Query("SELECT COUNT(id) from Projet")
    Integer findByCountProjet();

    @Query("SELECT COUNT(b.id)"
            + "FROM Phase b "
            + "INNER JOIN b.projet cat "
            + "WHERE cat.id = :id"
    )
    public Integer findByNbrePhases(@Param("id") Long idprojet);

    @Query("SELECT COUNT(b.id)"
            + "FROM Phase b "
            + "INNER JOIN b.projet cat "
            + "WHERE cat.id = :id and b.etat_realisation = :etat"
    )
    public Integer findByNbreEtatPhases(@Param("id") Long idprojet, @Param("etat") boolean etat);

}
