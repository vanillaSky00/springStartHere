package com.vanillacare.springstarthere.ch12_DB;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(
            PurchaseRepository purchaseRepository
    ) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping("/purchase")
    public void storePurchase(
            @RequestBody Purchase purchase
    ) {
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping("/purchase")
    public List<Purchase> findPurchase() {
        return purchaseRepository.findAllPerchases();
    }
}
