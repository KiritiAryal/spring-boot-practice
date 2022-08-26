package com.example.spring.dto;

public class User {
    private String id;
    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public User() {
    }
    public User(String id, String userName, String address) {
        this.id = id;
        this.userName = userName;
        this.address = address;
    }


}
