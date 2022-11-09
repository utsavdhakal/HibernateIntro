package com.example.hibernateIntro.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "USER_DETAILS")
public class UserDetails {

    private int userID;

    private String username;

    @Id
    @Column(name = "USER_ID")
    public int getUserID() {
        return userID;
    }

    public void setUserID(int id) {
        this.userID = id;
    }

    @Column(name = "USER_NAME")
    public String getUsername() {
        return username + " from getter";
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
