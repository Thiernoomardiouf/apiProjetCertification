package com.simplon.apiapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PartenaireDto {

    private Long id;
    private String code;
    private String nom;
    private String adresse;
    private String telephone;
    private String contact;
    private String email;
    private String adresse_web;
    private List<ProjetDto> projets;

}
