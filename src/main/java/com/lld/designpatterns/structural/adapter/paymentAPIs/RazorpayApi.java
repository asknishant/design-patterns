package com.lld.designpatterns.structural.adapter.paymentAPIs;

/// step  - create incompatible interfaces
public class RazorpayApi {
    public void pay(Long id, String name, String email, Double amount) {
        System.out.println("Razor Pay payment");
    }

    public RazorpayStatus checkStatus(Long id) {
        return RazorpayStatus.OK;
    }
}
