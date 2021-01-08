package com.co.newchallenge.exceptions;

public class CreationFailed extends AssertionError {
    public CreationFailed(String message, Throwable cause) {
        super(message, cause);
    }
}
