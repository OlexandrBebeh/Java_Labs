package com.company.view.exceptions;

public class NotCurrentDigitException extends RuntimeException {
    NotCurrentDigitException() {
        super("default_exception_number");
    }

    public NotCurrentDigitException(String message) {
        super(message);
    }

}
