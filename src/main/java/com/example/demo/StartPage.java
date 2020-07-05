package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartPage {

    @GetMapping("/")
    public String page(){
        return "Star Page!";
    }
}
