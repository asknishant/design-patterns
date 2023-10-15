package com.lld.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// step - 1 - split state into intrinsic state. Intrinsic fields are the fields that do not change.
@AllArgsConstructor
@Getter
public class Bullet {
    private String image;
    private Double radius;
    private Double weight;
    private BulletType bulletType;

}
