package com.lld.designpatterns.behavioural.strategy;

// step 1 - create an interface.
public interface NavigationStrategy {
    Double navigate(String from, String to); // return time to navigate.
}
