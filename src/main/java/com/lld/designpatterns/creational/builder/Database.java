package com.lld.designpatterns.creational.builder;

import lombok.Getter;

@Getter
public class Database {
    private String name;
    private String username;
    private String password;
    private Integer port;
    private DatabaseType type;
    private Boolean isCompressed;

    private Database() {}

    public static Builder builder() {
        return new Builder();
    }

    // Step 1 - create a static inner class/ friend class
    public static class Builder {
        // this class can access all the private fields.

        // Step 2- Add the fields to inner class
       /* private String name;
        private String username;
        private String password;
        private Integer port;
        private DatabaseType type;
        private Boolean isCompressed;*/

        // there can be cases when you miss a field in the inner class , to avoid that we create a reference of the outer class in the inner class.
        public Database database;

        private Builder() {
            database = new Database();
        }

        // step 3 - create setters for the builder class
        public Builder setName(String name) {
            //this.name = name;
            database.name = name;
            return this;
        }

        public Builder credentials(String username, String password) {
            //this.username = username;
            //this.password = password;
            database.username = username;
            database.password = password;
            return this;
        }


        public Builder setPort(Integer port) {
            //this.port = port;
            database.port = port;
            return this;
        }

        public Builder setType(DatabaseType type) {
            //this.type = type;
            database.type = type;
            return this;
        }

        public Builder compressed() {
            //isCompressed = true;
            database.isCompressed = true;
            return this;
        }

        // step 4 - expose the database object/hook
        public Database build() {

            Database newDatabase = new Database(); // we are able to call private constructor because Builder is static inner class
            if(!validate()) {
                throw new IllegalArgumentException("Bad data");
            }
            newDatabase.name = database.name;
            newDatabase.username = database.username;
            newDatabase.isCompressed = database.isCompressed;
            newDatabase.port = database.port;
            newDatabase.type = database.type;
            newDatabase.password = database.password;

            return  newDatabase;
        }

        public boolean validate() {
            return database.type != DatabaseType.MY_SQL || database.port == 3307;
        }
    }
}
