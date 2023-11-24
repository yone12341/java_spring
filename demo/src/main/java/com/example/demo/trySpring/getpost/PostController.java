package com.example.demo.trySpring.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    
    @PostMapping("/getpost/postpage")
    public String home() {
        return "getpost/postpage";
    }
}
