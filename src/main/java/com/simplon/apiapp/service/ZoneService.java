package com.simplon.apiapp.service;

import com.simplon.apiapp.model.Zone;
import com.simplon.apiapp.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;

    public List<Zone> getAllzone(){
        return zoneRepository.findAll();
    }

    public Optional<Zone> getZone(Long id){
        return zoneRepository.findById(id);
    }

    public void deleteZone(Long id){
        zoneRepository.deleteById(id);
    }

    public Zone addZone(Zone zone){
        Zone p = zoneRepository.save(zone);
        return p;
    }

}
