package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Membre;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MembreValidator {

    public static List<String> validate(Membre membreDto){
        List<String> errors = new ArrayList<>();

        if (membreDto==null){
            errors.add("Veillez renseigner les informations du partenaire");
        }
        if (!StringUtils.hasLength(membreDto.getLastName())){
            errors.add("Veillez renseigner le nom de l'employer");
        }
        if (!StringUtils.hasLength(membreDto.getFirstName())){
            errors.add("Veillez renseigner le prenom de l'employé");
        }
        if (!StringUtils.hasLength(membreDto.getMatricule())){
            errors.add("Veillez donner la matricule de l'employé");
        }
        if (!StringUtils.hasLength(membreDto.getUsername())){
            errors.add("Veillez donner le login de l'empoyé");
        }
        if (!StringUtils.hasLength(membreDto.getTelephone())){
            errors.add("Veillez donner le numéro de téléphone de l'employé");
        }

        return errors;
    }
}
