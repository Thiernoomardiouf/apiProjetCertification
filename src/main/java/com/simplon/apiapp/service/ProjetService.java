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

    public void deleteProjet(Long id){
        projetRepository.deleteById(id);
    }

    public Projet addProjet(Projet projet){
        Projet p = projetRepository.save(projet);
        return p;
    }
}