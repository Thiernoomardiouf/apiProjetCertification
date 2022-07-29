package com.simplon.apiapp.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Builder
@Table(name = "rolesmembre")
public class Rolesmembre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Role role;
    @ManyToOne(fetch = FetchType.EAGER)
    private Membre membre;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
