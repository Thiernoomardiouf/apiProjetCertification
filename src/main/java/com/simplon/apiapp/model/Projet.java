package com.simplon.apiapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "projets")
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String nom;
    private String description;
    private double cout;
    private Date date_debut;
    private Date date_fin;

    @ManyToOne
    private Partenaire partenaire;

    @OneToMany(mappedBy = "projet")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Phase> phases;

    @OneToMany(mappedBy = "projete")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Profil> profils;

    @OneToMany(mappedBy = "projet")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Zone> zones;

}
