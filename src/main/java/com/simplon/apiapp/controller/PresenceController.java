package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Phase;
import com.simplon.apiapp.model.Presence;
import com.simplon.apiapp.service.PhaseService;
import com.simplon.apiapp.service.PresenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class PresenceController {

    @Autowired
    private PresenceService presenceService;

    @GetMapping(path = APP_ROOT + "/presences")
    public List<Presence> getAllPresences(){
        return presenceService.getAllPresence();
    }

    @GetMapping(path = APP_ROOT + "/presences/{id}")
    public Optional<Presence> getPresence(@PathVariable("id") Long id){
        Optional<Presence> p = presenceService.getPresence(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/presences/delete/{id}")
    public void deletePresence(@PathVariable("id") Long id){
        presenceService.deletePresence(id);
    }

    @PostMapping(path = APP_ROOT + "/presences/add")
    public Presence addPresence(@RequestBody Presence presence){
        return presenceService.addPresence(presence);
    }

    @PutMapping(path = APP_ROOT + "/presences/update/{id}")
    public Presence updatePresence(@PathVariable("id") Long id, @RequestBody Presence presence){
        presence.setId(id);
        return presenceService.addPresence(presence);
    }
}
