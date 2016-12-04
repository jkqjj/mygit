package com.yulintu.yulintu_di.construtor;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class Person {
    private Long pid;
    private String pname;
    private Student student;

    public Person(Long pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public Person(String pname, Student student) {
        this.pname = pname;
        this.student = student;
    }

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
}
