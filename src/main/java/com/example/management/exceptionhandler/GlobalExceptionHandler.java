package com.example.management.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

        // Handle specific exception
        @ExceptionHandler(NumberNotTenDigitException.class)
        public ResponseEntity<String> handleStudentNotFound(NumberNotTenDigitException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }

        // Handle IllegalArgumentException
        @ExceptionHandler(IllegalArgumentException.class)
        public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
        // Handle all other exceptions (generic)
        @ExceptionHandler(Exception.class)
        public ResponseEntity<String> handleException(Exception ex) {
            return new ResponseEntity<>("Internal Server Error: " + ex.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
