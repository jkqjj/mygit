package com.yulintu.userManager.domain;

/**
 * Created by jiajiaQian on 2016/11/17.
 */
public class User {

    private int userId;

    private String username;

    private String password;

    private String userSex;

    public User() {
    }

    public User(String username, String password, String userSex) {
        this.username = username;
        this.password = password;
        this.userSex = userSex;
    }

    public User(int userId, String username, String password, String userSex) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userSex = userSex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + userSex + '\'' +
                '}';
    }
}
