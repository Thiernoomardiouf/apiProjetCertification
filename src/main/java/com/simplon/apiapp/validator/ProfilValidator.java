package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Profil;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ProfilValidator {

    public static List<String> validate(Profil profil){
        List<String> errors = new ArrayList<>();

        if (profil==null || !StringUtils.hasLength(profil.getLibelle())){
            errors.add("Veillez renseigner le nom du profil");
        }

        return errors;
    }
}
