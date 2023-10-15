package com.lld.designpatterns.structural.facade;


public class OderManagerImpl implements OrderManager {

    OrderProcessor orderProcessor = new OrderProcessorImpl();
    @Override
    public void checkout(Long orderId) {
        orderProcessor.process(orderId);
    }
}
