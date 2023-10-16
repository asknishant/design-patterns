package com.lld.designpatterns.behavioural;

import com.lld.designpatterns.behavioural.observer.Bitcoin;
import com.lld.designpatterns.behavioural.observer.BitcoinManager;
import com.lld.designpatterns.behavioural.observer.EmailConsumer;
import com.lld.designpatterns.behavioural.observer.SmsConsumer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ObserverTest {
    // We write unit test cases when we want to test independent piece of codes.
    // To make our test cases independent. We use two very common methods.
    //setup ==> create the dependencies. Before each test case it creates the dependencies.
    // TearDown ===> Destroy the dependencies. After each test case it destroys.

    private BitcoinManager bitcoinManager;

    @BeforeEach
    public void setUp() {
        Bitcoin bitcoin = new Bitcoin(100.0);
        bitcoinManager = new BitcoinManager(bitcoin);
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SmsConsumer());
    }

    @Test
    public void  update() {
        bitcoinManager.setPrice(90.0);
        //fail();
    }

}
