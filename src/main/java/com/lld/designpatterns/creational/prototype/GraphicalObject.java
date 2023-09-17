package com.lld.designpatterns.creational.prototype;


// step 1 :- Create a clonable interface
@FunctionalInterface
public interface GraphicalObject {
    GraphicalObject cloneObject();
    //void try(); -- will throw an error bcz functional interface can have only one abstract method
}
