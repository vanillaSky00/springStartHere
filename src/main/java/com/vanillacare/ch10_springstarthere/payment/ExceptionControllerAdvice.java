package com.vanillacare.ch10_springstarthere.payment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)

    public ResponseEntity<?> exceptionNotEnoughMoneyHandler() {
        return ResponseEntity
                .badRequest()
                .body(new ErrorDetails("Not enough money to make the payment"));
    }
}
