package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Projet;
import com.simplon.apiapp.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @GetMapping("/projets")
    public List<Projet> getAllProjets(){
        return projetService.getAllProjet();
    }

    @GetMapping("/projets/{id}")
    public Optional<Projet> getProjet(@PathVariable("id") Long id){
        Optional<Projet> p = projetService.getProjet(id);
        return p;
    }

    @GetMapping("/projets/delete/{id}")
    public void deleProjet(@PathVariable("id") Long id){
        projetService.deleteProjet(id);
    }

    @PostMapping("/projets/add")
    public Projet addProjet(@RequestBody Projet projet){
        return projetService.addProjet(projet);
    }

    @PutMapping ("/projets/update/{id}")
    public Projet updateProjet(@PathVariable("id") Long id, @RequestBody Projet projet){
        Optional<Projet> prt = projetService.getProjet(id);
        if(prt.isPresent()){
            Projet p = prt.get();
            String code = projet.getCode();
            if(code != null){
                p.setCode(code);
            }
            String nom = projet.getNom();
            if(nom != null){
                p.setNom(nom);
            }
            String description = projet.getDescription();
            if(description != null){
                p.setDescription(description);
            }
            double cout = projet.getCout();
            if(cout == 0){
                p.setCout(cout);
            }
            Date date_debut = projet.getDate_debut();
            if(date_debut != null){
                p.setDate_debut(date_debut);
            }
            Date date_fin = projet.getDate_fin();
            if(date_fin != null){
                p.setDate_fin(date_fin);
            }

            projetService.addProjet(p);
            return p;
        }
        else {
            return null;
        }
    }
}
