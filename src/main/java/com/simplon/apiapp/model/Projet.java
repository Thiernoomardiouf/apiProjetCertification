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
@Table(name = "projets")
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String nom;
    private String description;
    private String zone;
    private double cout;
    private Date date_debut;
    private Date date_fin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "partenaire_id", nullable = false)
    private Partenaire partenaire;

    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Phase> phases;

    @OneToMany(mappedBy = "projete", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Profil> profils;

    @OneToMany(mappedBy = "projet_zone", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Zone> zones;
}
