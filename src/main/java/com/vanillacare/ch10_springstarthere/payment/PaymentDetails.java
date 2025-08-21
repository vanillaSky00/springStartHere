package com.vanillacare.ch10_springstarthere.payment;

public record PaymentDetails(
        double amount, String status, String transactionId
) {
}