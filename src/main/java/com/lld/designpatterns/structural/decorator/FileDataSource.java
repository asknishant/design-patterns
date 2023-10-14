package com.lld.designpatterns.structural.decorator;

// Step 2 - concrete product class
public class FileDataSource implements DataSource {
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
