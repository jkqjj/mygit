package com.yulintu.yulintu_di.set;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class Person {
    private Long pid;//代表基本类型的包装类
    private String pname;//String类型
    private Student student;//引用类型
    private List lists;//集合
    private Set sets;//集合
    private Map map;
    private Properties properties;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
