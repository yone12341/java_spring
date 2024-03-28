package com.example.demo.test001.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetController {
    
    @GetMapping("/getpost/getpage")
    public String home(@RequestParam("testGet")String str, Model model) {

        model.addAttribute("getText",str);
        System.out.println(str);
        return "getpost/getpage";
    }
}
