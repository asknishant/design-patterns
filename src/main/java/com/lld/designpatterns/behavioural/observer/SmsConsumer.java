package com.lld.designpatterns.behavioural.observer;

public class SmsConsumer implements Consumer {
    @Override
    public void consume(Double price) {
        System.out.println("Sending sms for price: " + price);
    }
}
