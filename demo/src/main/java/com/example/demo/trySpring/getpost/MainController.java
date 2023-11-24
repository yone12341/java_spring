package com.example.demo.trySpring.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/getpost/main")
    public String home() {
        return "getpost/main";
    }
}
