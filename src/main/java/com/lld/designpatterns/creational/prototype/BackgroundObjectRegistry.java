package com.lld.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;


/*
* When I want to create multiple different objects but creation of a single object is expensive
* then I can create an object(prototype) store it, get that object, clone it and modify it.
* */
public class BackgroundObjectRegistry {
    Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();
    public void addPrototype(BackgroundObject backgroundObject) {
        registry.put(backgroundObject.getType(), backgroundObject);
    }

    public void removePrototype(BackgroundObjectType type) {
        registry.remove(type);
    }

    public BackgroundObject getPrototype(BackgroundObjectType type) {
        return registry.get(type);
    }
}
