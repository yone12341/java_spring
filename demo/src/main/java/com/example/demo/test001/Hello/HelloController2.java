package com.example.demo.test001.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController2 {

    @GetMapping("/hello2")
    public String home() {

        return "hello2";
    }
}
