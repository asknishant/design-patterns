package com.lld.designpatterns.srpandocp;

import java.awt.*;

public class Eagle extends Bird{

    public Eagle(String name, Double weight, Size size, BirdType birdType, Color color) {
        super(name, weight, size, birdType, color);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
