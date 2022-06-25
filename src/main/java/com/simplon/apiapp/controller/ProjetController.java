package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Projet;
import com.simplon.apiapp.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @GetMapping(path = APP_ROOT + "/projets")
    public List<Projet> getAllProjets(){
        return projetService.getAllProjet();
    }

    @GetMapping(path = APP_ROOT + "/projets/{id}")
    public Optional<Projet> getProjet(@PathVariable("id") Long id){
        Optional<Projet> p = projetService.getProjet(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/projets/code")
    public Projet getProjetCode(String code){
        return projetService.getProjetCode(code);
    }

    @GetMapping(path = APP_ROOT + "/projets/delete/{id}")
    public void deleProjet(@PathVariable("id") Long id){
        projetService.deleteProjet(id);
    }

    @PostMapping(path = APP_ROOT + "/projets/add")
    public Projet addProjet(@RequestBody Projet projet){
        return projetService.addProjet(projet);
    }

    @PutMapping (path = APP_ROOT + "/projets/update/{id}")
    public Projet updateProjet(@PathVariable("id") Long id, @RequestBody Projet projet){
        projet.setId(id);
        return projetService.addProjet(projet);
   }
}
