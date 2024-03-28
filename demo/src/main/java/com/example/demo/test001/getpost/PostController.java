package com.example.demo.test001.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    
    @PostMapping("/getpost/postpage")
    public String home(@RequestParam("testPost")String str, Model model) {
        model.addAttribute("postText",str);
        System.out.println(str);
        return "getpost/postpage";
    }
}
