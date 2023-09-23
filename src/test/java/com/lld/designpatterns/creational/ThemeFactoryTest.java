package com.lld.designpatterns.creational;

import com.lld.designpatterns.creational.abstractfactory.*;
import com.lld.designpatterns.creational.abstractfactory.factory.DarkThemefactory;
import com.lld.designpatterns.creational.abstractfactory.factory.Themefactory;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class ThemeFactoryTest {
    @Test
    public void testDarkTheme() {
        Themefactory darkThemeFactory = new DarkThemefactory();
        Button button = darkThemeFactory.createButton(0.5, 10.0 , null);
        assertTrue( "If using dark theme, the button should be dark btn", button instanceof DarkButton);

        Radio radio = darkThemeFactory.createRadio();
        assertTrue("If using dark theme, the radio should be dark radio", radio instanceof DarkRadio);
    }
}
