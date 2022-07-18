package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Livrable;
import com.simplon.apiapp.service.LivrableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class LivrableController {

    @Autowired
    private LivrableService livrableService;

    @GetMapping(path = APP_ROOT + "/livrables")
    public List<Livrable> getAllLivrables(){
        return livrableService.getAllLivrable();
    }

    @GetMapping(path = APP_ROOT + "/livrables/{id}")
    public Optional<Livrable> getLivrable(@PathVariable("id") Long id){
        Optional<Livrable> p = livrableService.getLivrable(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/livrables/delete/{id}")
    public void deleteLivrable(@PathVariable("id") Long id){
        livrableService.deleteLivrable(id);
    }

    @PostMapping(path = APP_ROOT + "/livrables/add")
    public Livrable addLivrable(@RequestBody Livrable livrable){
        return livrableService.addLivrable(livrable);
    }

    @PutMapping (path = APP_ROOT + "/livrables/update/{id}")
    public Livrable updateLivrable(@PathVariable("id") Long id, @RequestBody Livrable livrable){
        livrable.setId(id);
        return livrableService.addLivrable(livrable);
    }
}
