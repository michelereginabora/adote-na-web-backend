package com.adotenaweb.adotenawebapi.exceptions.auth;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
