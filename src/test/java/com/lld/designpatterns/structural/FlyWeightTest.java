package com.lld.designpatterns.structural;

import com.lld.designpatterns.structural.flyweight.Bullet;
import com.lld.designpatterns.structural.flyweight.BulletRegistry;
import com.lld.designpatterns.structural.flyweight.BulletType;
import com.lld.designpatterns.structural.flyweight.FlyingBullet;
import org.junit.jupiter.api.Test;

public class FlyWeightTest {
    @Test
    void createFkyWeight() {

        BulletRegistry registry = new BulletRegistry();

        Bullet bullet1 = new Bullet("IMAGE", 0.0, 10.0, BulletType.NINE_MM);
        Bullet bullet2 = new Bullet("IMAGE_2", 0.0, 10.0, BulletType.ELEVEN_MM);

        registry.addBullet(bullet1);
        registry.addBullet(bullet2);

        FlyingBullet flyingBullet1 = new FlyingBullet(0.0, 0.0,0.0, -12.0, bullet1);
        FlyingBullet flyingBullet2 = new FlyingBullet(10.0, 10.0,10.0, -12.0, bullet2);
        // One bullet is used for every flying bullet. This saves memory.
    }
}
