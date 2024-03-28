package com.example.demo.test001.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController1 {
    
    @GetMapping("/sample1")
    public String displayTest001() {
        return "sample1";
    }
}
