package com.lld.designpatterns.structural.decorator;

// Step 1 - create a product interface.
public interface DataSource {
    String read();
    void write(String value);
}
