package com.lld.designpatterns.creational.abstractfactory.factory;
import com.lld.designpatterns.creational.abstractfactory.Button;
import com.lld.designpatterns.creational.abstractfactory.Radio;

// step 3 - Factory interface
public interface Themefactory {
    Button createButton(Double border, Double length, Double radius);
    Radio createRadio();
}
