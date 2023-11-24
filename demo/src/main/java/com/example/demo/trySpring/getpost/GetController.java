package com.example.demo.trySpring.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController {
    
    @GetMapping("/getpost/getpage")
    public String home() {
        return "getpost/getpage";
    }
}
