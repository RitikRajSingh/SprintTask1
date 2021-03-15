package com.cg.sprintexample.customer.exception;

public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }

}
