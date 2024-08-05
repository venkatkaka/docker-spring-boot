package com.sample.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

     @GetMapping("/hello")
    public String index(final Model model) {
        model.addAttribute("title", "Openshift + Spring Boot");
        model.addAttribute("msg", "Welcome to the Openshift platform!");
        return "index";
    }
}
