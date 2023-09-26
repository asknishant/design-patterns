package com.lld.designpatterns.structural.adapter.paymentAPIs;

public class PayUPayApi {
    public void makePayment(Long id, Double amount) {
        System.out.println("PayU payment");
    }

    public PayUStatus getStatus(Long id) {
        return PayUStatus.SUCCESS;
    }
}
