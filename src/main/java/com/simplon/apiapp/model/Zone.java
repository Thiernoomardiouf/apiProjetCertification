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
@Table(name = "zones")
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Projet projet;
}
