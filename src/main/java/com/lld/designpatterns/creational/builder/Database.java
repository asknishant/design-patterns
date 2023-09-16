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
        private String name;
        private String username;
        private String password;
        private Integer port;
        private DatabaseType type;
        private Boolean isCompressed;

        // step 3 - create setters for the builder class
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder credentials(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }


        public Builder setPort(Integer port) {
            this.port = port;
            return this;
        }

        public Builder setType(DatabaseType type) {
            this.type = type;
            return this;
        }

        public Builder compressed() {
            isCompressed = true;
            return this;
        }

        // step 4 - expose the database object/hook
        public Database build() {

            Database database = new Database(); // we are able to call private constructor because Builder is static inner class
            if(!validate()) {
                throw new IllegalArgumentException("Bad data");
            }
            database.name = name;
            database.username = username;
            database.isCompressed = isCompressed;
            database.port = port;
            database.type = type;
            database.password = password;

            return  database;
        }

        public boolean validate() {
            if(type == DatabaseType.MY_SQL && port != 3307) {
                return false;
            }
            return true;
        }
    }
}
