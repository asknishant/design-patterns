package com.lld.designpatterns.creational;

import com.lld.designpatterns.creational.factory.*;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class FactoryTest {

     /*RoundBtn roundBtn = new RoundBtn(10.0, 1.0);
       SquareBtn squaredBtn = new SquareBtn(10.0, 1.0);
       Now changing RoundBtn to RoundButton will cause error because of tight coupling.
       so how do we achieve this? we achieve this through introducing an abstract class (not interface here) because interfaces should not have attributes.Also both
       the buttons have common behavior. If they had differnt behavior we would have created separate interfaces.
     */
    @Test
    public void testRoundButton() {
        Button button = ButtonFactory.createButton(ScreenSize.PHONE,10.0,1.0, null);
        assertTrue("If the screen size is of a phone, the btn should be round", button instanceof RoundButton);
    }
    @Test
    public void testSquaredButton() {
        Button button = ButtonFactory.createButton(ScreenSize.DESKTOP,10.0,1.0, null);
        assertTrue("If the screen size is of a phone, the btn should be round", button instanceof SquareButton);
    }
}


/*
* Why factory pattern?
* 1. SRP and OCP --> works.
* 2. Complex construction logic --> Done
* 3. Reduce usage of subclasses - loose coupling
*
* Downside of factory
* 1. Parameter explosion
* 2. SRP + OCP violation in createButton method
* */