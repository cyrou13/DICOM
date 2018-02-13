package com.cyrou.studylist.beans;

public class UserDataSource {

    private String username;

    public UserDataSource() {
    }

    public UserDataSource(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
