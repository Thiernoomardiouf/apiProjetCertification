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

    @GetMapping(path = "/projets")
    public List<Projet> getAllProjets(){
        return projetService.getAllProjet();
    }

    @GetMapping(path = "/projets/{id}")
    public Optional<Projet> getProjet(@PathVariable("id") Long id){
        Optional<Projet> p = projetService.getProjet(id);
        return p;
    }

    @GetMapping(path = "/projets/delete/{id}")
    public void deleProjet(@PathVariable("id") Long id){
        projetService.deleteProjet(id);
    }

    @PostMapping(path = "/projets/add")
    public Projet addProjet(@RequestBody Projet projet){
        return projetService.addProjet(projet);
    }

    @PutMapping (path = "/projets/update/{id}")
    public Projet updateProjet(@PathVariable("id") Long id, @RequestBody Projet projet){
        projet.setId(id);
        return projetService.addProjet(projet);
   }
}
