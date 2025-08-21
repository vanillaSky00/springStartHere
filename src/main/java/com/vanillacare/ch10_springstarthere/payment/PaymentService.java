package com.vanillacare.ch10_springstarthere.payment;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public PaymentDetails processPayment(double amount){
        if (amount > (double) 100){
            throw new NotEnoughMoneyException("Balance too low for " + amount);
        }
        return new PaymentDetails(amount, "APPROVED", "tx-" + System.nanoTime());
    }
}