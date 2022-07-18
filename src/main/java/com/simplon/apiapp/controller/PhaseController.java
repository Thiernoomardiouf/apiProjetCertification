package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Phase;
import com.simplon.apiapp.service.PhaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class PhaseController {

    @Autowired
    private PhaseService phaseService;

    @GetMapping(path = APP_ROOT + "/phases")
    public List<Phase> getAllPhases(){
        return phaseService.getAllPhase();
    }

    @GetMapping(path = APP_ROOT + "/phases/{id}")
    public Optional<Phase> getPhase(@PathVariable("id") Long id){
        Optional<Phase> p = phaseService.getPhase(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/phases/delete/{id}")
    public void deletePhase(@PathVariable("id") Long id){
        phaseService.deletePhase(id);
    }

    @PostMapping(path = APP_ROOT + "/phases/add")
    public Phase addPhase(@RequestBody Phase phase){
        return phaseService.addPhase(phase);
    }

    @PutMapping (path = APP_ROOT + "/phases/update/{id}")
    public Phase updatePartenaire(@PathVariable("id") Long id, @RequestBody Phase phase){
        phase.setId(id);
        return phaseService.addPhase(phase);
    }
}
