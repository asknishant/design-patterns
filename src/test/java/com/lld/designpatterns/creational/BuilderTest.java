package com.lld.designpatterns.creational;

import com.lld.designpatterns.creational.builder.Database;
import com.lld.designpatterns.creational.builder.DatabaseType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertEquals;


public class BuilderTest {
    @Test
    public void testDatabaseBuilder() {
        Database database = Database.builder()
                .setType(DatabaseType.MY_SQL)
                .setName("db")
                .credentials("ironman", "avengers")
                .setPort(3307)
                .compressed()
                .build();

        // database.setName("db1") // it will throw an error.

        /*
        the above database object is immutable new if
        you can modify the existing object then it will change values
        of database because builder is mutable and database is immutable.
        * */
        assertNotNull(database,"If build method is called, database object should not be null");
        assertEquals("If name is set, on fethcing it should be the same", database.getName(), "db  ");
        assertEquals(" If mysql is set, on fethcing it should be the same", DatabaseType.MY_SQL, database.getType());
    }
}
