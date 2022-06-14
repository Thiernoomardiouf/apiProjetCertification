package com.simplon.apiapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "profils")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private boolean isChef;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Projet projete;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Membre membre;
}
