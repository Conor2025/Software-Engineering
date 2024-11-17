package com.example.demo.loginStatusController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginStatusController {
    @GetMapping("/")
    public String displayLoginStatus(Model model) {
        boolean isLoggedIn = false;

        model.addAttribute("isLoggedIn", isLoggedIn);
        return "index";
    }
    
}
