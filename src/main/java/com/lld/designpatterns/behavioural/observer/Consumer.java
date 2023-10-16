package com.lld.designpatterns.behavioural.observer;

// creating consumer/observer interface(note - producer is called observable)
public interface Consumer {
    void consume(Double price);
}
