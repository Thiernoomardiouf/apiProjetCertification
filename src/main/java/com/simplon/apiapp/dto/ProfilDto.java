package com.simplon.apiapp.dto;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.model.Projet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProfilDto {

    private Long id;
    private String libelle;
    private boolean isChef;
    private Projet projete;
    private Membre membre;
}
