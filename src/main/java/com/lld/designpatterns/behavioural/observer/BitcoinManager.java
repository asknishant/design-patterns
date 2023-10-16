package com.lld.designpatterns.behavioural.observer;

import lombok.AllArgsConstructor;

// Step 2 - Extend the publisher class
@AllArgsConstructor
public class BitcoinManager extends Publisher {
    private Bitcoin bitcoin;
    public void setPrice(Double price) {
        // if there is an increase in price then notify all the consumers
        if(bitcoin.getPrice() - price > 5.0) {
            publish(price);
        }
        bitcoin.setPrice(price);
    }
}
