package com.lld.designpatterns.structural;

import com.lld.designpatterns.structural.decorator.CompressorDecorator;
import com.lld.designpatterns.structural.decorator.DataSource;
import com.lld.designpatterns.structural.decorator.EncryptionDecorator;
import com.lld.designpatterns.structural.decorator.FileDataSource;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class DecoratorTest {
    @Test
    void testRead() {
        DataSource db = new FileDataSource();
        assertEquals("If read is called , base should be returned", "Base", db.read());
    }

    @Test
    void testEncryption() {
        // EncryptedDatasource
        DataSource db = new FileDataSource();
        DataSource encryptedDb = new EncryptionDecorator(db);
        assertEquals("If read is called , base should be returned", "Base - Decrypted", encryptedDb.read());
    }

    @Test
    void testCompression() {
        DataSource db = new FileDataSource();
        DataSource compressedDb = new CompressorDecorator(db);
        assertEquals("If read is called , decrypted should be returned", "Base - Decompressed", compressedDb.read());
    }
    @Test
    void testEncryptionCompression() {
        DataSource db = new FileDataSource();
        DataSource encryptedDb = new EncryptionDecorator(db);
        DataSource compressedDb = new CompressorDecorator(encryptedDb);
        assertEquals("If read is called , decrypted should be returned", "Base - Decrypted - Decompressed", compressedDb.read());
    }
}
