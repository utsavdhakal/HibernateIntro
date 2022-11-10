package com.example.hibernateIntro.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private int userID;

    private String username;

    @Embedded
    private Address address;

    public UserDetails() {

    }
    public UserDetails(String username, Address address) {
        this.username = username;
        this.address = address;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int id) {
        this.userID = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
