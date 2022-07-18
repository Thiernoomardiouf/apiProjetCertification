package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Projet;
import com.simplon.apiapp.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    public List<Projet> getAllProjet(){
        return projetRepository.findAll();
    }

    public Optional<Projet> getProjet(Long id){
        return projetRepository.findById(id);
    }

    public Projet getProjetCode(String code){
        return projetRepository.findByCode(code);
    }

    public void deleteProjet(Long id){
        projetRepository.deleteById(id);
    }

    public Projet addProjet(Projet projet){
        Projet p = projetRepository.save(projet);
        return p;
    }

    public Integer nbreProjet(){
        return projetRepository.findByCountProjet();
    }

    public Integer nbrePhases(Long id){
        return projetRepository.findByNbrePhases(id);
    }

    public Integer nbrePhasesEtat(Long id, boolean etat){
        return projetRepository.findByNbreEtatPhases(id, etat);
    }
}
