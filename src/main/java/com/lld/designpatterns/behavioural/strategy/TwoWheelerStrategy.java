package com.lld.designpatterns.behavioural.strategy;

public class TwoWheelerStrategy implements NavigationStrategy {
    @Override
    public Double navigate(String from, String to) {
        // Geo Code the location.
        // Distance between the locations.
        // blah blah... write your algorithm.
        return 0.0;
    }
}
