package com.lld.designpatterns.creational.abstractfactory;

import lombok.Getter;

// step 2 - create concrete product classes
@Getter
public class LightButton extends Button {
    private Double length;

    public LightButton(Double border, Double length, Double radius) {
        super(border);
        this.length = length;
    }

    public void onClick() {
        System.out.println("Light button clicked");
    }

    public void render() {
        System.out.println("Light button rendered");
    }
}
