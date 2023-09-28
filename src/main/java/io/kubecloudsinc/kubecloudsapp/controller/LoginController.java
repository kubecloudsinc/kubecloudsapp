package io.kubecloudsinc.kubecloudsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
