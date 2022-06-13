package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Partenaire;
import com.simplon.apiapp.service.PartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PartenaireController {

    @Autowired
    private PartenaireService partenaireService;

    @GetMapping("/partenaires")
    public List<Partenaire> getAllPartenaires(){
        return partenaireService.getAllPartenaire();
    }

    @GetMapping("/partenaires/{id}")
    public Optional<Partenaire> getPartenaire(@PathVariable("id") Long id){
        Optional<Partenaire> p = partenaireService.getPartenaire(id);
        return p;
    }

    @GetMapping("/partenaires/delete/{id}")
    public void deletePartenaire(@PathVariable("id") Long id){
        partenaireService.deletePartenaire(id);
    }

    @PostMapping("/partenaires/add")
    public Partenaire addPartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.addPartenaire(partenaire);
    }

    @PutMapping ("/partenires/update/{id}")
    public Partenaire updatePartenaire(@PathVariable("id") Long id, @RequestBody Partenaire partenaire){
        Optional<Partenaire> part = partenaireService.getPartenaire(id);
        if(part.isPresent()){
            Partenaire p = part.get();
            String code = partenaire.getCode();
            if(code != null){
                p.setCode(code);
            }
            String nom = partenaire.getNom();
            if(nom != null){
                p.setNom(nom);
            }
            String adresse = partenaire.getAdresse();
            if(adresse != null){
                p.setAdresse(adresse);
            }
            String telephone = partenaire.getTelephone();
            if(telephone != null){
                p.setTelephone(telephone);
            }
            String contact = partenaire.getContact();
            if(contact != null){
                p.setContact(contact);
            }
            String email = partenaire.getEmail();
            if(email != null){
                p.setEmail(email);
            }
            String adresse_web = partenaire.getAdresse_web();
            if(adresse_web != null){
                p.setAdresse_web(adresse_web);
            }

            partenaireService.addPartenaire(p);
            return p;
        }
        else {
            return null;
        }
    }
}
