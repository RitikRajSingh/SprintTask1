package com.cg.sprintexample.customer.exception;

public class InvalidIdException extends RuntimeException {
    public InvalidIdException(String msg) {
        super(msg);
    }

}