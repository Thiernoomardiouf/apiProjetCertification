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
@Table(name = "membres")
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String login;
    private String mot_de_passe;

    @OneToMany(mappedBy = "membre", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Profil> profils;
}
