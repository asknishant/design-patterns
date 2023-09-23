package com.lld.designpatterns.creational.abstractfactory;

import lombok.Getter;


// step 2 - create a concrete product classes.
@Getter
public class DarkButton extends Button {
    private Double radius;

    public DarkButton(Double border, Double radius) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick() {
        System.out.println("Dark Btn clicked");
    }

    @Override
    public void render() {
        System.out.println("Rendered!");
    }
}
