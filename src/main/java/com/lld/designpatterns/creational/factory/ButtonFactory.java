package com.lld.designpatterns.creational.factory;

public class ButtonFactory {
    // create a static factory method.
    // here the createButton takes a lot of parameters which tells us to use builder pattern.
    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch(screenSize) {
            case PHONE:
            case TABLET: return new RoundButton(border, radius);
            case DESKTOP: return new SquareButton(border, radius);
        }
        throw new IllegalArgumentException("Invalid type" + screenSize);
    }
}
