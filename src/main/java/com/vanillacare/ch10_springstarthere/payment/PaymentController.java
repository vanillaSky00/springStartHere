package com.vanillacare.ch10_springstarthere.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//not recommend in production code because it is coupled with the exception
//@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(
            @RequestParam double amount){
        try{
            PaymentDetails paymentDetails = paymentService.processPayment(amount);
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException e) {
            return ResponseEntity
                    .badRequest()
                    .body(new ErrorDetails("Not enough money to make the payment." + " " + e.getMessage()));
        }
    }


    @GetMapping("/product")
    public ResponseEntity<?> getProduct() {
        class Album {
            public String singer;
            public double price;
            public Album(String singer, double price){
                this.singer = singer;
                this.price = price;
            }
        }

        Album album = new Album("Taylor Swift", 1989);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("singer", "taylor")
                .header("album", "fearless")
                .header("when","1995")
                .body(album);
    }
}
