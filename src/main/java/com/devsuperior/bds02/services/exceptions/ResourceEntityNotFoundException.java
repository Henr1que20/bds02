package com.devsuperior.bds02.services.exceptions;

public class ResourceEntityNotFoundException extends RuntimeException{

    public ResourceEntityNotFoundException(String message) {
        super(message);
    }
}
