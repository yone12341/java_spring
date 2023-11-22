package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String home() {

        int cnt = 1;
        for (int i=0; i<10; i++) {
            cnt = cnt + cnt;
            System.out.println(cnt);
        }
        return "hello";
    }
}
