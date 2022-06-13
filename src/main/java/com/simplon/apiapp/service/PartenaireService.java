package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Partenaire;
import com.simplon.apiapp.repository.PartenaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartenaireService {

    @Autowired
    private PartenaireRepository partenaireRepository;

    public List<Partenaire> getAllPartenaire(){
        return partenaireRepository.findAll();
    }

    public Optional<Partenaire> getPartenaire(Long id){
       return partenaireRepository.findById(id);
    }

    public void deletePartenaire(Long id){
        partenaireRepository.deleteById(id);
    }

    public Partenaire addPartenaire(Partenaire partenaire){
        Partenaire p = partenaireRepository.save(partenaire);
        return p;
    }
}
