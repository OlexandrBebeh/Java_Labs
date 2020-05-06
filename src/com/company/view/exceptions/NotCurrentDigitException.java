package com.company.view.exceptions;

public class NotCurrentDigitException extends RuntimeException {
    NotCurrentDigitException() {
        super("Digit isn`t current! Pleas enter current digit!");
    }

    public NotCurrentDigitException(String message) {
        super(message);
    }

}
