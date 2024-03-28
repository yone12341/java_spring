package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test001Controller {
    
    @GetMapping("/test001")
    public String displayTest001() {
        return "test001";
    }
}
