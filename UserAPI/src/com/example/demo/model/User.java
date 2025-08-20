package com.example.demo.model;

public class User {
    private String name;
    private String account;

    public User(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }
}
