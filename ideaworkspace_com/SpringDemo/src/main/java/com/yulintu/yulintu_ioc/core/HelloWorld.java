package com.yulintu.yulintu_ioc.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class HelloWorld {
    private String name;

    private List<String> lists = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello!" + name);
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    public List<String> getLists() {
        return lists;
    }


}
