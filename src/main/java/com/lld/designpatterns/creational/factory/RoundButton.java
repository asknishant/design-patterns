package com.lld.designpatterns.creational.factory;

import lombok.Getter;


// step 2 - create a concrete product classes.
@Getter
public class RoundButton extends Button {
    private Double radius;

    public RoundButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick() {
        System.out.println("Round Btn clicked");
    }

    @Override
    public void render() {
        System.out.println("Rendered!");
    }
}
