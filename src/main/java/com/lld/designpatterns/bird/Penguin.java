package com.lld.designpatterns.bird;

import java.awt.*;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, Double weight, Size size, BirdType birdType, Color color) {
        super(name, weight, size, birdType, color);
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }
}
