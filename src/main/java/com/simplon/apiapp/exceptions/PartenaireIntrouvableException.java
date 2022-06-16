package com.simplon.apiapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PartenaireIntrouvableException extends RuntimeException  {

    //@ResponseStatus(HttpStatus.NOT_FOUND)
    public PartenaireIntrouvableException(String s) {
        super(s);
    }
}
