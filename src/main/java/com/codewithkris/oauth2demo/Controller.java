package com.codewithkris.oauth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String unrestricted() {
        return "you don't need to be logged in";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "if you see this you are logged in";
    }
}
