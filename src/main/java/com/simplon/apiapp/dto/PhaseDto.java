package com.simplon.apiapp.dto;

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
public class PhaseDto {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private String document;
    private double montant;
    private boolean etat_realisation;

    private ProjetDto projet;
    private List<LivrableDto> livrables;

}
