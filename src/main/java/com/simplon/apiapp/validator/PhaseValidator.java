package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Phase;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PhaseValidator {

    public static List<String> validate(Phase phase){
        List<String> errors = new ArrayList<>();

        if (phase==null){
            errors.add("Veillez renseigner le code");
            errors.add("Veillez renseigner le nom du projet");
            errors.add("Veillez donner la description de la phase");
        }
        if (!StringUtils.hasLength(phase.getCode())){
            errors.add("Veillez renseigner le code");
        }
        if (!StringUtils.hasLength(phase.getLibelle())){
            errors.add("Veillez renseigner le nom du projet");
        }
        if (!StringUtils.hasLength(phase.getDescription())){
            errors.add("Veillez donner la description de la phase");
        }
        if (phase.getMontant()==0){
            errors.add("Veillez donner le cout de cette phase");
        }
        if (phase.getDate_debut()==null){
            errors.add("Veillez donner la de début de la phase");
        }
        if (phase.getDate_fin()==null){
            errors.add("Veillez donner la de fin de la phase");
        }

        return errors;
    }
}
