package com.lld.designpatterns.structural;

import com.lld.designpatterns.structural.adapter.PaymentProvider;
import com.lld.designpatterns.structural.adapter.PaymentRequest;
import com.lld.designpatterns.structural.adapter.PaymentStatus;
import com.lld.designpatterns.structural.adapter.RazorPayAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PaymentProviderTest {
    // just change the adapter to your need. Its just acts like a bridge that supports with all the socket.
    PaymentProvider adapter = new RazorPayAdapter();
//  PaymentProvider adapter = new RazorPayAdapter();// this works as well
    @Test
    void testPayMethod() {
        // adapter.createPayment(1L, "Walter", "walter@gmail.com", 100.0); instead use builder
        adapter.createPayment(PaymentRequest.builder()
                .id(1L)
                .amount(200.0)
                .id(1L)
                .name("Walter")
                .email("walter@gmail.com")
                .build()
        );
    }

    @Test
    void testStatus() {
        PaymentStatus status = adapter.verifyStatus(1L);
        Assertions.assertEquals(PaymentStatus.DONE, status, "If status is fetched, it should be done");
    }
}
