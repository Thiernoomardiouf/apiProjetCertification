package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Partenaire;
import com.simplon.apiapp.service.PartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
public class PartenaireController {

    @Autowired
    private PartenaireService partenaireService;

    @GetMapping(path = APP_ROOT + "/partenaires")
    public List<Partenaire> getAllPartenaires(){
        return partenaireService.getAllPartenaire();
    }

    @GetMapping(path = APP_ROOT + "/partenaires/{id}")
    public Optional<Partenaire> getPartenaire(@PathVariable("id") Long id) {
        Optional<Partenaire> p = partenaireService.getPartenaire(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/partenaires/delete/{id}")
    public void deletePartenaire(@PathVariable("id") Long id){
        partenaireService.deletePartenaire(id);
    }

    @PostMapping(path = APP_ROOT + "/partenaires/add")
    public Partenaire addPartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.addPartenaire(partenaire);
    }

    @PutMapping (path = APP_ROOT + "/partenires/update/{id}")
    public Partenaire updatePartenaire(@PathVariable("id") Long id, @RequestBody Partenaire partenaire){
        partenaire.setId(id);
        return partenaireService.addPartenaire(partenaire);
    }
}
