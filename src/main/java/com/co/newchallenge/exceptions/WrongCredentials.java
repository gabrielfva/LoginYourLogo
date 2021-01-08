package com.co.newchallenge.exceptions;

public class WrongCredentials extends AssertionError{
    public WrongCredentials(String wrongCredentialsMessage, Throwable cause){
        super(wrongCredentialsMessage, cause);
    }
}
