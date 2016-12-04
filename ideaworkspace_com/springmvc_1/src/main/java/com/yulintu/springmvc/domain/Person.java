package com.yulintu.springmvc.domain;

/**
 * Created by qianjiajia on 2016/11/28.
 */
public class Person {

    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("正在调用setId方法，id = "+id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "{id:"+id+"name:"+name+"address:"+address+"}";
    }
}
