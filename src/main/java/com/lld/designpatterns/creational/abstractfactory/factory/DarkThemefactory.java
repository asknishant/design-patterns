package com.lld.designpatterns.creational.abstractfactory.factory;

import com.lld.designpatterns.creational.abstractfactory.Button;
import com.lld.designpatterns.creational.abstractfactory.DarkButton;
import com.lld.designpatterns.creational.abstractfactory.DarkRadio;
import com.lld.designpatterns.creational.abstractfactory.Radio;

public class DarkThemefactory implements Themefactory{
    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new DarkButton(border, radius);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
}
