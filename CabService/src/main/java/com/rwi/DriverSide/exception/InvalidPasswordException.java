package com.rwi.DriverSide.exception;

public class InvalidPasswordException extends Exception{
    String message;
    public InvalidPasswordException(String message){
        super();
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}
