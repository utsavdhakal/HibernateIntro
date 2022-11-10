package com.example.hibernateIntro.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private int userID;

    private String username;

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

}
