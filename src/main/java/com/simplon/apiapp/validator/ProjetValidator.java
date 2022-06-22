package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Projet;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ProjetValidator {

    public static List<String> validate(Projet projet){
        List<String> errors = new ArrayList<>();

        if (projet==null){
            errors.add("Veillez renseigner le code");
            errors.add("Veillez renseigner le nom");
            errors.add("Veillez renseigner le cout");
            errors.add("Veillez renseigner la date de début et de fin");
        }
        if (!StringUtils.hasLength(projet.getCode())){
            errors.add("Veillez renseigner le code");
        }
        if (!StringUtils.hasLength(projet.getNom())){
            errors.add("Veillez renseigner le nom du projet");
        }
        if (!StringUtils.hasLength(projet.getDescription())){
            errors.add("Veillez donner la description du projet");
        }
        if (projet.getCout()==0){
            errors.add("Veillez donner le cout du projet");
        }
        if (projet.getDate_debut()==null){
            errors.add("Veillez donner la de début du projet");
        }
        if (projet.getDate_fin()==null){
            errors.add("Veillez donner la de fin du projet");
        }

        return errors;
    }
}
