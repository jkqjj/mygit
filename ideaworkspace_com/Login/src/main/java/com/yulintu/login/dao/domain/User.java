package com.yulintu.login.dao.domain;

/**
 * Created by qianjiajia on 2016/11/14.
 */
public class User {

    private String username;

    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.username = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "User{" +
                "username='"+username + '\''+
                ",password='"+password + '\''+
                '}';
    }
}
