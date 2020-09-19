package com.codecool.guestbookkubenzi.Model;

public class User {
    private int ID;
    private String name;
    private String address;

    public User(int ID, String name, String address){
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public User(String name, String address){
        this.name = name;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
