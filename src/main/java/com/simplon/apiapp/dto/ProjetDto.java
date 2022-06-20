package com.simplon.apiapp.dto;

import com.simplon.apiapp.model.Partenaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProjetDto {

    private Long id;
    private String code;
    private String nom;
    private String description;
    private double cout;
    private Date date_debut;
    private Date date_fin;

    private Partenaire partenaire;
    private List<PhaseDto> phases;
    private List<ProfilDto> profils;
    private List<ZoneDto> zones;
}
