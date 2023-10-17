package com.lld.designpatterns.behavioural;

import com.lld.designpatterns.behavioural.strategy.Navigator;
import com.lld.designpatterns.behavioural.strategy.TwoWheelerStrategy;
import org.junit.jupiter.api.Test;

// step 4
public class StrategyTest {
    @Test
    void testBullet() {
        TwoWheelerStrategy honda = new TwoWheelerStrategy();
        Navigator navigator = new Navigator(honda); // Dependency injection(We do it to obey dependency inversion.
        navigator.navigate("HSR", "Kormangla");

        // Now how are we doing protecting code duplication?
        // ans:- Now let's say we want to go via a new twowheeler(Ducati). We can use the same strategy.
    }
}
