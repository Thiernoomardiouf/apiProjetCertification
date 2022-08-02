package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Membre;
import com.simplon.apiapp.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembreService {

    @Autowired
    private MembreRepository membreRepository;

    public List<Membre> getAllMembre(){
        return membreRepository.findAll();
    }

    public Optional<Membre> getMembre(Long id){
        return membreRepository.findById(id);
    }

    public Membre getMembreByUsername(String username){
        return membreRepository.findByUsername(username);
    }

    public void deleteMembre(Long id){
        membreRepository.deleteById(id);
    }

    public Membre addMembre(Membre membre){
        Membre p = membreRepository.save(membre);
        return p;
    }
}
