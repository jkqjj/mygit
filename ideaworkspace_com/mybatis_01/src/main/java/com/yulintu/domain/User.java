package com.yulintu.domain;

/**
 * Created by qianjiajia on 2016/11/28.
 */
public class User {
    private String id;
    //private String name;
    private String userName;
    private String address;

    public String getId() {
        System.out.println("正在通过getId方法获取id的值："+id);
        return id;
    }

    public void setId(String id) {
        System.out.println("正在通过setId方法注入id的值："+id);
        this.id = id;
    }

    //public String getName() {
    //    return name;
    //}
    //
    //public void setName(String name) {
    //    System.out.println("正在通过setName方法注入name的值："+name);
    //    this.name = name;
    //}


    public String getUserName() {
        System.out.println("正在通过getuserName方法获取name的值："+userName);
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("正在通过setuserName方法注入name的值："+userName);
        this.userName = userName;
    }

    public String getAddress() {
        System.out.println("正在通过getAddress方法获取address的值："+address);
        return address;
    }

    public void setAddress(String address) {
        System.out.println("正在通过setAddress方法注入address的值："+address);
        this.address = address;
    }

    public String toString(){
        return "(id: "+id+",name: "+userName+",address: "+address+")";
    }
}
