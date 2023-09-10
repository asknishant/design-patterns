package com.lld.designpatterns;

import com.lld.designpatterns.bird.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle 1", 32.00, Size.MEDIUM, BirdType.EAGLE, Color.BLACK);
        eagle.fly();
        Penguin penguin = new Penguin("Eagle 1", 32.00, Size.LARGE, BirdType.PENGUIN, Color.BLACK);
        penguin.swim();
    }
}
