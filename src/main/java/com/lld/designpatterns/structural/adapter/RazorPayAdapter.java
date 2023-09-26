package com.lld.designpatterns.structural.adapter;

import com.lld.designpatterns.structural.adapter.paymentAPIs.RazorpayApi;
import com.lld.designpatterns.structural.adapter.paymentAPIs.RazorpayStatus;

public class RazorPayAdapter implements PaymentProvider {

    private RazorpayApi razorpayApi = new RazorpayApi();
    @Override
    public void createPayment(PaymentRequest paymentRequest) {
        razorpayApi.pay(paymentRequest.getId(), paymentRequest.getName(), paymentRequest.getEmail(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorpayStatus razorpayStatus = razorpayApi.checkStatus(id);
        return to(razorpayStatus);
    }

    private PaymentStatus to(RazorpayStatus razorpayStatus) {
        switch (razorpayStatus) {
            case OK : return PaymentStatus.DONE;
            case ERROR : return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Invalid razorPayStatus :" + razorpayStatus);
    }
}
