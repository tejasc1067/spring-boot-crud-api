package com.tejas.demo;

public class UserV2 {
    private String fullName;
    private String email;

    public UserV2(String fullName, String email){
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName(){
        return fullName;
    }

    public String getEmail(){
        return email;
    }
}
