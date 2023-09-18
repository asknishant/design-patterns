package com.lld.designpatterns.creational.factory;

public class ButtonFactory {
    // create a static factory method.
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch(screenSize) {
            case PHONE:
            case TABLET: return new RoundButton(border, radius);
            case DESKTOP: return new SquareButton(border, radius);
        }
        throw new IllegalArgumentException("Invalid type" + screenSize);
    }
}
