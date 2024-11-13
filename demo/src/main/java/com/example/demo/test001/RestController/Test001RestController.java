package com.example.demo.test001.RestController;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test001.Form.UserForm;

@RestController
public class Test001RestController {
   @PostMapping("/sample1/restSumbit")
    public String postSample1(@ModelAttribute @Validated UserForm form, BindingResult result) {

        if(result.hasErrors()) {
            return "sample1";
        }

        return "sample1";
    }
}