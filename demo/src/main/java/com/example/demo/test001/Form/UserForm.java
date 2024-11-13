package com.example.demo.test001.Form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserForm {

    @NotBlank(message = "Id cannot be null")
    private String id;
    @NotBlank(message = "Name cannot be null")
    private String username;

}
