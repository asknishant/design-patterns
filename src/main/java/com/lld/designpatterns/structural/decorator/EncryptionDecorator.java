package com.lld.designpatterns.structural.decorator;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(DataSource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String value = nextLayer.read();
        return decrypt(value);
    }

    private String decrypt(String value) {
        return value + " - Decrypted";
    }

    @Override
    public void write(String value) {
        String encrypted = encrypt(value);
        nextLayer.write(encrypted);
    }

    private String encrypt(String value) {
        return value + " - Encrypted";
    }
}
