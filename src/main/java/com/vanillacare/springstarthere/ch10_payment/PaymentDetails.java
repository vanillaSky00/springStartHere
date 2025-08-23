package com.vanillacare.springstarthere.ch10_payment;

public record PaymentDetails(
        double amount, String status, String transactionId
) {
}