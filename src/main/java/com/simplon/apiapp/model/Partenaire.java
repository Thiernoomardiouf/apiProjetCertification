package com.simplon.apiapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
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

    @OneToMany(mappedBy = "partenaire", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Projet> projets;

    public void setId(Long id) {
        this.id = id;
    }
}
