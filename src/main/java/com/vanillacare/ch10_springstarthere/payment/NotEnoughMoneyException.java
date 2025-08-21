package com.vanillacare.ch10_springstarthere.payment;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException() {
        super();
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}