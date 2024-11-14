package com.example.demo.trySpring.login.domain.model;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SignupForm {
    
    @NotBlank
    @Email
    private String userId;

    @NotBlank
    @Length(min=4,max=100)
    @Pattern(regexp = "^[a-zA-Z0-9$]")
    private String passWord;

    @NotBlank
    private String userName;

    @NotNull
    @DateTimeFormat(pattern="yyyy/MM/dd")
    private Date birthday;

    @Min(20)
    @Max(100)
    private int age;

    @AssertFalse
    private boolean marriage;
}
