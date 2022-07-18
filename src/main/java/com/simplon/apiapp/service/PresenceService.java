package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Presence;
import com.simplon.apiapp.repository.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PresenceService {
    @Autowired
    private PresenceRepository presenceRepository;

    public List<Presence> getAllPresence(){
        return presenceRepository.findAll();
    }

    public Optional<Presence> getPresence(Long id){
        return presenceRepository.findById(id);
    }

    public void deletePresence(Long id){
        presenceRepository.deleteById(id);
    }

    public Presence addPresence(Presence presence){
        Presence p = presenceRepository.save(presence);
        return p;
    }
}
