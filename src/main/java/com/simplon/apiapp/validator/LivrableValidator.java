package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Livrable;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LivrableValidator {

    public static List<String> validate(Livrable livrableDto){
        List<String> errors = new ArrayList<>();

        if (livrableDto==null){
            errors.add("Veillez renseigner les informations du livrable");
        }
        if (!StringUtils.hasLength(livrableDto.getLibelle())){
            errors.add("Veillez renseigner le nom du livrable");
        }
        if (!StringUtils.hasLength(livrableDto.getDescription())){
            errors.add("Veillez renseigner la description du livrable");
        }
        if (!StringUtils.hasLength(livrableDto.getCode())){
            errors.add("Veillez donner le code du livrable");
        }

        return errors;
    }
}
