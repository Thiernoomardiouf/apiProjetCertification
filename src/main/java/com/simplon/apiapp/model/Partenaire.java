package com.simplon.apiapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patenaires")
public class Partenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nom;
    private String adresse;
    private String telephone;
    private String contact;
    private String email;
    private String adresse_web;

    @OneToMany(mappedBy = "partenaire", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Projet> projets;
}
