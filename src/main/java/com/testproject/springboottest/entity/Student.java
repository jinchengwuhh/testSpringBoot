package com.testproject.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    private String username;
    private String password;
    private String sex;
    private String academy;
    private String major;
    private String clazzid;
    private String clazzname;
    private String credit;
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClazzid() {
        return clazzid;
    }

    public void setClazzid(String clazzid) {
        this.clazzid = clazzid;
    }

    public String getClazzname() {
        return clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
    @Override
    public String toString() {
        return "Student{" +
                "password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", academy='" + academy + '\'' +
                ", major='" + major + '\'' +
                ", clazzid='" + clazzid + '\'' +
                ", clazzname='" + clazzname + '\'' +
                ", credit='" + credit + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
