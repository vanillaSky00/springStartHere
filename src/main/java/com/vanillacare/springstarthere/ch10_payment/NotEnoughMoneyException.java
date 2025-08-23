package com.vanillacare.springstarthere.ch10_payment;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException() {
        super();
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}