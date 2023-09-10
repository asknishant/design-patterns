package com.lld.designpatterns.bird;

import java.awt.*;

public class Eagle extends Bird implements Flyable  {

    public Eagle(String name, Double weight, Size size, BirdType birdType, Color color) {
        super(name, weight, size, birdType, color);
    }


    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
