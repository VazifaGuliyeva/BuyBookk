package com.example.buybook.exception;

public class AuthorNotFoundException extends RuntimeException{


    public AuthorNotFoundException(String message){
        super(message);
    }
}
