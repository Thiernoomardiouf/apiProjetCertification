package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Profil;
import com.simplon.apiapp.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfilService {

    @Autowired
    private ProfilRepository profilRepository;

    public List<Profil> getAllProfil(){
        return profilRepository.findAll();
    }

    public Optional<Profil> getProfil(Long id){
        return profilRepository.findById(id);
    }

    public void deleteProfil(Long id){
        profilRepository.deleteById(id);
    }

    public Profil addProfil(Profil profil){
        Profil p = profilRepository.save(profil);
        return p;
    }
}
