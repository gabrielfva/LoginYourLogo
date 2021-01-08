package com.co.newchallenge.exceptions;

public class EmailOnly extends AssertionError{
    public EmailOnly(String errorEmailOnly, Throwable cause){
        super(errorEmailOnly, cause);
    }
}
