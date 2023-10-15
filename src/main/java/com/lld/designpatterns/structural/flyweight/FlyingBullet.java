package com.lld.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;

// step 2 - create extrinsic state. Extrinsic fields are the fields that do change.
@AllArgsConstructor
public class FlyingBullet {
    private Double x, y, z;
    private  Double direction;

    // step 3 - Add a has-a relation
    private Bullet bullet;
}
