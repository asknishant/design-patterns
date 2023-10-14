package com.lld.designpatterns.structural.decorator;

public class CompressorDecorator extends BaseDecorator {
    public CompressorDecorator(DataSource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String compressed = nextLayer.read();
        return decompress(compressed);
    }

    private String decompress(String compress) {
        return compress + " - Decompressed";
    }

    @Override
    public void write(String value) {
        String compress = compress(value);
        nextLayer.write(compress);
    }

    private String compress(String value) {
        return value + " - Compressed";
    }


}
