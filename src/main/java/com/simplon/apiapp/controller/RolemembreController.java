package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Rolesmembre;
import com.simplon.apiapp.service.RolemembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class RolemembreController {
    @Autowired
    private RolemembreService rolemembreService;

    @GetMapping(path = APP_ROOT + "/rolesmembres")
    public List<Rolesmembre> getAllRolesmembres(){
        return rolemembreService.getAllRolemembres();
    }

    @GetMapping(path = APP_ROOT + "/rolesmembres/{id}")
    public Optional<Rolesmembre> getRolemembre(@PathVariable("id") Long id){
        Optional<Rolesmembre> p = rolemembreService.getRolemembre(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/rolesmembres/delete/{id}")
    public void deleteRolemembre(@PathVariable("id") Long id){
        rolemembreService.deleteRolemembre(id);
    }

    @PostMapping(path = APP_ROOT + "/rolesmembres/add")
    public Rolesmembre addRolemembre(@RequestBody Rolesmembre rolemembre){
        return rolemembreService.addRolemembre(rolemembre);
    }

    @PutMapping (path = APP_ROOT + "/rolesmembres/update/{id}")
    public Rolesmembre updateRolemembre(@PathVariable("id") Long id, @RequestBody Rolesmembre rolesmembre){
        rolesmembre.setId(id);
        return rolemembreService.addRolemembre(rolesmembre);
    }
}
