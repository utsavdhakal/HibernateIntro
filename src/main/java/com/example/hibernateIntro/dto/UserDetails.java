package com.example.hibernateIntro.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
    @Id
    @Column(name = "USER_ID")
    private int userID;

    /*@Transient*/
    @Column(name = "USER_NAME")
    private String username;

    /*@Temporal(TemporalType.TIME)*/
    @Column(name = "REGISTERED_AT")
    private Date registeredAt;

    /*@Lob*/
    @Column(name = "DESCRIPTION")
    private String description;

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

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", registeredAt=" + registeredAt +
                ", description='" + description + '\'' +
                '}';
    }
}
