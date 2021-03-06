package com.esakki.ticketreserve.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TheaterNotFoundException extends RuntimeException {
    public TheaterNotFoundException(String ex) {
        super(ex);
    }
}
