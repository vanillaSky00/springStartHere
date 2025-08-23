package com.vanillacare.springstarthere.ch10_payment;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController_viaAdvice {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(PaymentController_viaAdvice.class);
    private final PaymentService paymentService;
    private static Logger logger = Logger.getLogger(PaymentService.class.getName());

    public PaymentController_viaAdvice(
            PaymentService paymentService
    ) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(
            @RequestParam double amount,
            @RequestBody String user) {

        logger.info(user + "request to buy things");
        PaymentDetails paymentDetails = paymentService.processPayment(amount);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
