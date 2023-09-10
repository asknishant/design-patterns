package com.lld.designpatterns.bird;

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

    public void eat() {}
    public void sleep() {}
}
