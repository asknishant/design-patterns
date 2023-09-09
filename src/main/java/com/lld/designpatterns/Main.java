package com.lld.designpatterns;

import com.lld.designpatterns.srpandocp.BirdType;
import com.lld.designpatterns.srpandocp.Eagle;
import com.lld.designpatterns.srpandocp.Size;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle 1", 32.00, Size.MEDIUM, BirdType.EAGLE, Color.BLACK);
        eagle.fly();
        // now if I need a new bird I will create a class for it so my Bird class does not have dependencies.
    }
}
