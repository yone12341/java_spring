package com.example.demo.trySpring.login.domain.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
    
    private String userId;
    private String passWord;
    private String userName;

    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date birthday;

    private int age;
    private boolean marriage;
}
