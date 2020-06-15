package com.company.view.exceptions;

public class NotCurrentFileNameException extends RuntimeException {
    NotCurrentFileNameException (){
        super("default_exception_format");
    }
    public NotCurrentFileNameException(String message){
        super(message);
    }
}
