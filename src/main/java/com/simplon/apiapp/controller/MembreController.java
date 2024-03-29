package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class MembreController {

    @Autowired
    private MembreService membreService;

    @GetMapping(path = APP_ROOT + "/membres")
    public List<Membre> getAllMembres(){
        return membreService.getAllMembre();
    }

    @GetMapping(path = APP_ROOT + "/membre/{id}")
    public Optional<Membre> getMembre(@PathVariable("id") Long id){
        Optional<Membre> p = membreService.getMembre(id);
        return p;
    }
    @GetMapping(path = APP_ROOT + "/membres/{username}")
    public Membre getMembreByUsername(@PathVariable("username") String username){
        Membre p = membreService.getMembreByUsername(username);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/membres/delete/{id}")
    public void deleteMembre(@PathVariable("id") Long id){
        membreService.deleteMembre(id);
    }

    @PostMapping(path = APP_ROOT + "/membres/add")
    public Membre addMembre(@RequestBody Membre membre){
        return membreService.addMembre(membre);
    }

    @PutMapping (path = APP_ROOT + "/membres/update/{id}")
    public Membre updateMembre(@PathVariable("id") Long id, @RequestBody Membre membre){
        membre.setId(id);
        return membreService.addMembre(membre);
    }
}
