package com.lld.designpatterns.creational.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

// step 1 - create a common product interface (abstract class and interfaces are used interchangeably always verify what to use when).Interfaces are only used when you
@AllArgsConstructor
@Getter
public abstract class Button {
    private  Double border;
    public abstract void render();
    public abstract void onClick();
}
