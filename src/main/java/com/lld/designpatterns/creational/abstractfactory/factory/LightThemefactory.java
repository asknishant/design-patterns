package com.lld.designpatterns.creational.abstractfactory.factory;

import com.lld.designpatterns.creational.abstractfactory.Button;
import com.lld.designpatterns.creational.abstractfactory.LightButton;
import com.lld.designpatterns.creational.abstractfactory.LightRadio;
import com.lld.designpatterns.creational.abstractfactory.Radio;

// step 4 - create concrete factory classes
public class LightThemefactory implements Themefactory{

    @Override
    public Button createButton(Double border, Double length, Double radius) {
        return new LightButton(border, length, radius);
    }

    @Override
    public Radio createRadio() {
        return new LightRadio();
    }
}
