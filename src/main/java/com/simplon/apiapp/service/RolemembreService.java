package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Rolesmembre;
import com.simplon.apiapp.repository.RolemembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolemembreService {
    @Autowired
    private RolemembreRepository rolemembreRepository;

    public List<Rolesmembre> getAllRolemembres(){
        return rolemembreRepository.findAll();
    }

    public Optional<Rolesmembre> getRolemembre(Long id){
        return rolemembreRepository.findById(id);
    }

    public void deleteRolemembre(Long id){
        rolemembreRepository.deleteById(id);
    }

    public Rolesmembre addRolemembre(Rolesmembre rolesmembre){
        Rolesmembre p = rolemembreRepository.save(rolesmembre);
        return p;
    }
}
