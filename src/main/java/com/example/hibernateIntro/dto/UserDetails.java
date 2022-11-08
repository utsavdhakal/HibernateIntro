package com.example.hibernateIntro.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    @Id
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
