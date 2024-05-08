package com.example.bloomspring.controller;

import com.example.bloomspring.model.FaultRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    private FaultRegistry submittedRegistry;
    @GetMapping("/")
    public String getIndexPage(){
        return "index"; // Assuming your index HTML file is named "index.html"
    }
    @GetMapping("main")
    public String mainPage(){
        return "main";
    }
    @GetMapping("/create-registry")
    public String showCreateRegistryPage(Model model) {
        // Add logic to populate model attributes if needed
        return "create-registry"; // Returns the create-registry.html Thymeleaf template
    }

    @PostMapping("/submit-registry")
    public String submitRegistry(@RequestParam("fields") String[] fields, @RequestParam("description") String description, Model model) {
        submittedRegistry = new FaultRegistry(fields, description);
        model.addAttribute("submittedRegistry", submittedRegistry);
        return "redirect:/registry-submitted";
    }

    @GetMapping("/registry-submitted")
    public String showRegistrySubmittedPage(Model model) {
        model.addAttribute("submittedRegistry", submittedRegistry);
        return "registry-submitted"; // Returns the registry-submitted.html Thymeleaf template
    }
}