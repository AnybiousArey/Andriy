package com.kpi.exceptions;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String message) {
        super(message);
    }
}