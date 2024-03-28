package com.example.demo.test001.Form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserForm {

    @NotNull(message = "Id cannot be null")
    private String id;
    @NotNull(message = "Name cannot be null")
    private String username;

}
