package com.skypro.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class QuestionInvalidAmountException extends RuntimeException {
    public QuestionInvalidAmountException() {
        super();
    }

    public QuestionInvalidAmountException(String message) {
        super(message);
    }
}