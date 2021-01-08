package com.co.newchallenge.exceptions;

public class PasswordOnly extends AssertionError{
    public PasswordOnly(String errorEmptyFields, Throwable cause){
        super(errorEmptyFields, cause);
    }
}
