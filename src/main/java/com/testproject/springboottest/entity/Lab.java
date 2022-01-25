package com.testproject.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Lab {
    @Id
    private String Id;
    private String lab_name;
    private String state;
    private String place;
    private String time;
    private String info;
}
