package com.lld.designpatterns.behavioural.strategy;

// step 3 - Adding reference to context class.
public class Navigator {
    private NavigationStrategy navigationStrategy;// Dependency inversion.

    public Navigator(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public Double navigate(String from, String to) {  // pass through methods or proxy methods.
        return navigationStrategy.navigate(from, to);
    }
}
