package com.tejas.demo;
import jakarta.validation.constraints.*;

public class User {
        private int id;

        @NotBlank(message = "Name cannot be empty")
        private String name;

        @NotBlank(message = "Email cannot be empty")
        private String email;

        public User() { }

        public User(int id, String name, String email){
            this.id = id;
            this.name = name;
            this.email = email;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
