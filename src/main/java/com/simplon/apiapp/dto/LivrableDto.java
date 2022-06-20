package com.simplon.apiapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LivrableDto {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private String chemin;
    private PhaseDto phase;
}
