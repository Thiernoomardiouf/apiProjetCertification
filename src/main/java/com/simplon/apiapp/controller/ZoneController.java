package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Partenaire;
import com.simplon.apiapp.model.Zone;
import com.simplon.apiapp.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @GetMapping(path = "/zones")
    public List<Zone> getAllZones(){
        return zoneService.getAllzone();
    }

    @GetMapping(path = "/zones/{id}")
    public Optional<Zone> getZone(@PathVariable("id") Long id){
        Optional<Zone> p = zoneService.getZone(id);
        return p;
    }

    @GetMapping(path = "/zones/delete/{id}")
    public void deleteZone(@PathVariable("id") Long id){
        zoneService.deleteZone(id);
    }

    @PostMapping(path = "/zones/add")
    public Zone addZone(@RequestBody Zone zone){
        return zoneService.addZone(zone);
    }

    @PutMapping (path = "/zones/update/{id}")
    public Zone updateZone(@PathVariable("id") Long id, @RequestBody Zone zone){
        zone.setId(id);
        return zoneService.addZone(zone);
    }
}
