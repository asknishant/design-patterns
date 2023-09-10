package com.lld.designpatterns.bird;

import java.awt.*;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, Double weight, Size size, BirdType birdType, Color color) {
        super(name, weight, size, birdType, color);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
