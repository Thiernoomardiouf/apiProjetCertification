package com.simplon.apiapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
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
    @JoinColumn(name = "projet_id", nullable = false)
    private Projet projet;

    @OneToMany(mappedBy = "phase", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Livrable> livrables;

}
