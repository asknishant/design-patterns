package com.lld.designpatterns.behavioural.observer;

public class Runner {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin(100.0);
        BitcoinManager bitcoinManager = new BitcoinManager(bitcoin);
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SmsConsumer());

        bitcoinManager.setPrice(90.0);
    }
}
