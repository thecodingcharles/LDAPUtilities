package com.base22.LDAPUtilities.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/WelcomeBase22er")
    public String getGreeting(){
        return "Hello!";
    }
}
