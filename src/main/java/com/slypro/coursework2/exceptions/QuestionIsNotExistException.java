package com.slypro.coursework2.exceptions;

public class QuestionIsNotExistException extends RuntimeException{
    public QuestionIsNotExistException() {
        super();
    }

    public QuestionIsNotExistException(String message) {
        super(message);
    }

}
