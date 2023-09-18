package com.lld.designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// step 2 - create concrete product classes
@Getter
public class SquareButton extends Button{
    private Double length;

    public SquareButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    public void onClick() {
        System.out.println("Squared button clicked");
    }

    public void render() {
        System.out.println("Squared button rendered");
    }
}
