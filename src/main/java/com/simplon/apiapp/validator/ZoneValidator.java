package com.simplon.apiapp.validator;

import com.simplon.apiapp.model.Zone;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ZoneValidator {

    public static List<String> validate(Zone zone){
        List<String> errors = new ArrayList<>();

        if (zone==null || !StringUtils.hasLength(zone.getLibelle())){
            errors.add("Veillez renseigner la localité");
        }

        return errors;
    }
}
