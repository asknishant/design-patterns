package com.lld.designpatterns.srpandocp;

import java.awt.*;

public class Sparrow extends Bird {
    public Sparrow(String name, Double weight, Size size, BirdType birdType, Color color) {
        super(name, weight, size, birdType, color);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
