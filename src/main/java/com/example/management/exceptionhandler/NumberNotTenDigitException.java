package com.example.management.exceptionhandler;


public class NumberNotTenDigitException extends RuntimeException{

    public NumberNotTenDigitException() {

        super("number should 10 digit");
    }

}