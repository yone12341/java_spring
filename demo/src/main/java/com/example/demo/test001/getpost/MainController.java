package com.example.demo.test001.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/getpost/main")
    public String home(Model model) {

        model.addAttribute("getInitValue", "getで送信したいテキスト");
        model.addAttribute("postInitValue", "postで送信したいテキスト");
        return "getpost/main";
    }
}
