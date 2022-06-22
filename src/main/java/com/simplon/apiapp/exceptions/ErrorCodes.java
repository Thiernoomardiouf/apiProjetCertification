package com.simplon.apiapp.exceptions;

public enum ErrorCodes {

    PROJET_NOT_FOUND(1000),
    PROJET_NOT_VALID(1001),
    MEMBRE_NOT_FOUND(2000),
    PARTENAIRE_NOT_FOUND(3000),
    PHASE_NOT_FOUND(4000),
    PROFIL_NOT_FOUND(5000),
    LIVRABLE_NOT_FOUND(6000),
    ZONE_NOT_FOUND(7000),
    ;

    private int code;

    ErrorCodes(int code){
        this.code= code;
    }

    public int getCode(){
        return code;
    }
}
