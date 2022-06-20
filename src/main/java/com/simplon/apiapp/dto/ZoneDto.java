package com.simplon.apiapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ZoneDto {

    private Long id;
    private String libelle;
    private ProjetDto projet;

}
