package com.example.ecommerce.models;

public class User {
    private long id;
    private String name;
    private String email;
    private String mobile;
    private String address;

    User (long id, String name, String email, String mobile, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }
    
}
