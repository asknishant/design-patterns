package com.lld.designpatterns.srpandocp;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public abstract class Bird {
    private String name;
    private Double weight;
    private Size size;
    private BirdType birdType;
    private Color color;

    public abstract void fly();
    public void eat() {}
    public void sleep() {}
}
