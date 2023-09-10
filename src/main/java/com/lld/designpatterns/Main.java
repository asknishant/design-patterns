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
/*
SOLID -
S - Single responsibility
O - Open for extension closed for modification
L - Liskov's substitution - no special case when subtyping(Parent should be substitutable for child)
I - Interface segregation - lean interfaces
D - Dependency Inversion - high level modules should not depend on low level modules
* */