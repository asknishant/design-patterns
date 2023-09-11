package com.lld.designpatterns.creational;

import com.lld.designpatterns.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingleInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assert singleton2 == singleton1;
    }
}
