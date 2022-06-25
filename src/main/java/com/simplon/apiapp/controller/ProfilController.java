package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Profil;
import com.simplon.apiapp.service.ProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
public class ProfilController {

    @Autowired
    private ProfilService profilService;

    @GetMapping(path = APP_ROOT + "/profils")
    public List<Profil> getAllProfils(){
        return profilService.getAllProfil();
    }

    @GetMapping(path = APP_ROOT + "/profils/{id}")
    public Optional<Profil> getPartenaire(@PathVariable("id") Long id){
        Optional<Profil> p = profilService.getProfil(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/profils/delete/{id}")
    public void deleteProfil(@PathVariable("id") Long id){
        profilService.deleteProfil(id);
    }

    @PostMapping(path = APP_ROOT + "/profils/add")
    public Profil addProfil(@RequestBody Profil profil){
        return profilService.addProfil(profil);
    }

    @PutMapping (path = APP_ROOT + "/profils/update/{id}")
    public Profil updateProfil(@PathVariable("id") Long id, @RequestBody Profil profil){
        profil.setId(id);
        return profilService.addProfil(profil);
    }
}
