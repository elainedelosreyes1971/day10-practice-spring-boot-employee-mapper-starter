package com.afs.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DuplicateCompanyException extends Exception {
    public DuplicateCompanyException() {
        super("Company name already exists.");
    }
}
