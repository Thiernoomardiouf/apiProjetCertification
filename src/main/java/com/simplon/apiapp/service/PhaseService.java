package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Phase;
import com.simplon.apiapp.repository.PhaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhaseService {

    @Autowired
    private PhaseRepository phaseRepository;

    public List<Phase> getAllPhase(){
        return phaseRepository.findAll();
    }

    public Optional<Phase> getPhase(Long id){
        return phaseRepository.findById(id);
    }

    public void deletePhase(Long id){
        phaseRepository.deleteById(id);
    }

    public Phase addPhase(Phase phase){
        Phase p = phaseRepository.save(phase);
        return p;
    }
}
