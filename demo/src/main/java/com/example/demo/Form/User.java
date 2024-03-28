package com.example.demo.Form;

import jakarta.validation.constraints.NotNull;

public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

}
