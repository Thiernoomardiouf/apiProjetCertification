package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Partenaire;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PartenaireValidator {

    public static List<String> validate(Partenaire partenaireDto){
        List<String> errors = new ArrayList<>();

        if (partenaireDto==null){
            errors.add("Veillez renseigner le code du partenaire");
            errors.add("Veillez renseigner le nom du partenaire");
            errors.add("Veillez renseigner l'adresse du partenaire");
            errors.add("Veillez donner le numéro de télépphone du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getCode())){
            errors.add("Veillez renseigner le code du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getNom())){
            errors.add("Veillez renseigner le nom du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getAdresse())){
            errors.add("Veillez donner l'adresse du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getTelephone())){
            errors.add("Veillez donner le numéro de télépphone du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getContact())){
            errors.add("Veillez donner le contact du partenaire");
        }
        if (!StringUtils.hasLength(partenaireDto.getEmail())){
            errors.add("Veillez donner le mail du partenaire");
        }

        return errors;
    }
}
