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
public class MembreDto {

    private Long id;
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String login;
    private String mot_de_passe;
    private List<ProfilDto> profils;
}
