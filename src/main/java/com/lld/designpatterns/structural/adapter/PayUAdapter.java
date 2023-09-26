package com.lld.designpatterns.structural.adapter;

import com.lld.designpatterns.structural.adapter.paymentAPIs.PayUPayApi;
import com.lld.designpatterns.structural.adapter.paymentAPIs.PayUStatus;

public class PayUAdapter implements PaymentProvider {
   PayUPayApi payUPayApi = new PayUPayApi();
    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        payUPayApi.makePayment(paymentRequest.getId(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUStatus payUStatus = payUPayApi.getStatus(id);
        return to(payUStatus);
    }

    private PaymentStatus to(PayUStatus payUStatus) {
        switch(payUStatus) {
            case SUCCESS : return PaymentStatus.DONE;
            case FAILURE: return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Invalid payUStatus" + payUStatus );
    }
}
