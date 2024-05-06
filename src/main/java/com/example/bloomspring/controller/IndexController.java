package com.example.bloomspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String getIndexPage(){
        return "index"; // Assuming your index HTML file is named "index.html"
    }
}