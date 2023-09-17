package com.lld.designpatterns.creational;

import com.lld.designpatterns.creational.prototype.BackgroundObject;
import com.lld.designpatterns.creational.prototype.BackgroundObjectRegistry;
import com.lld.designpatterns.creational.prototype.BackgroundObjectType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.util.AssertionErrors.assertNotNull;


public class BackgroundObjectTest {

    @Test
    public void testClone() {
        // step 3 - Create a prototype + clone it + modify it
        BackgroundObject prototype = new BackgroundObject(0.0,0.0,10.10,10.10, BackgroundObjectType.TREE);
        BackgroundObject clone = prototype.cloneObject();
        assertNotSame(prototype, clone, "If the clone is called a new object with same values should be returned"); // deep check (checks references of objects)
        assertEquals(prototype.getType(), clone.getType());
    }

    @Test
    public void testRegistry() {
        // create a prototype
        BackgroundObject prototype = new BackgroundObject(0.0, 0.0, 0.0, 10.0, BackgroundObjectType.BUILDING);

        // add a prototype to the registry
        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();
        registry.addPrototype(prototype);

        // fetch the prototype
        BackgroundObject backgroundObject = registry.getPrototype(prototype.getType());
        assertNotNull( "If prtotype is stored, it shoul d not be null", backgroundObject);

        BackgroundObject mountains = registry.getPrototype(BackgroundObjectType.MOUNTAINS);
        assertNull(mountains, "If prototype is stored, it should return the object");
    }
}
