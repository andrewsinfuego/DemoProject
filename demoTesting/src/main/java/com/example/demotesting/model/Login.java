package com.example.demotesting.model;

public class Login {
    private String userID;
    private String password;
    public Login(String userID, String password){
        this.userID = userID;
        this.password = password;
    }
    public Login() {
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
