package com.simplon.apiapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "phases")
public class Phase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private String document;
    private double montant;
    private boolean etat_realisation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Projet projet;

    @OneToMany(mappedBy = "phase", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Livrable> livrables;

}
