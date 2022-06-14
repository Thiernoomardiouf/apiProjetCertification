package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MembreController {

    @Autowired
    private MembreService membreService;

    @GetMapping(path = "/membres")
    public List<Membre> getAllMembres(){
        return membreService.getAllMembre();
    }

    @GetMapping(path = "/membres/{id}")
    public Optional<Membre> getPartenaire(@PathVariable("id") Long id){
        Optional<Membre> p = membreService.getMembre(id);
        return p;
    }

    @GetMapping(path = "/membres/delete/{id}")
    public void deleteMembre(@PathVariable("id") Long id){
        membreService.deleteMembre(id);
    }

    @PostMapping(path = "/membres/add")
    public Membre addMembre(@RequestBody Membre membre){
        return membreService.addMembre(membre);
    }

    @PutMapping (path = "/membres/update/{id}")
    public Membre updatePartenaire(@PathVariable("id") Long id, @RequestBody Membre membre){
        membre.setId(id);
        return membreService.addMembre(membre);
    }
}
