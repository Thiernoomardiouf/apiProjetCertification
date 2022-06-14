package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Livrable;
import com.simplon.apiapp.repository.LivrableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrableService {

    @Autowired
    private LivrableRepository livrableRepository;

    public List<Livrable> getAllLivrable(){
        return livrableRepository.findAll();
    }

    public Optional<Livrable> getLivrable(Long id){
        return livrableRepository.findById(id);
    }

    public void deleteLivrable(Long id){
        livrableRepository.deleteById(id);
    }

    public Livrable addLivrable(Livrable livrable){
        Livrable p = livrableRepository.save(livrable);
        return p;
    }
}
