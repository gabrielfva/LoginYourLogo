package com.co.newchallenge.exceptions;

public class EmailNotRegistered extends AssertionError {
    public EmailNotRegistered(String errorRegisteredEmail, Throwable cause){
        super(errorRegisteredEmail, cause);
    }
}
