package com.example.demo.test001.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.test001.Form.UserForm;

@Controller
public class SampleController1 {
    
    @GetMapping("/sample1")
    public String getSample1(Model model, @ModelAttribute UserForm form) {
        
        model.addAttribute("userForm", form);
        return "sample1";
    }

    @PostMapping("/sample1/sumbit")
    public String postSample1(@ModelAttribute UserForm form) {

        System.out.println(form.getId());
        System.out.println(form.getUsername());

        return "sample1";
    }
}
