package com.rocketseat.passin.domain.checkin.exceptions;

public class CheckInAlreadyExistException extends RuntimeException {
    public CheckInAlreadyExistException(String message){
        super(message);
    }
}