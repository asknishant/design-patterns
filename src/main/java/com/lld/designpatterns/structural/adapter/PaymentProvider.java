package com.lld.designpatterns.structural.adapter;

public interface PaymentProvider {
    // void createPayment(Long id, String name, String email, Double amount); // it can grow and can have too many params. Use Builder instead
    void createPayment(PaymentRequest paymentRequest); // paymentRequest is nothing but a DTO.
    PaymentStatus verifyStatus(Long id);
}
