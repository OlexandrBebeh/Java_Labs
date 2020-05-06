package com.company.view.exceptions;

public class NotCurrentFileNameException extends RuntimeException {
    NotCurrentFileNameException (){
        super("Don't current name for file!");
    }
    public NotCurrentFileNameException(String message){
        super(message);
    }
}
