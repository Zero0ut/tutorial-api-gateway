package com.example.springbootsampleservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String portNumber;

    @GetMapping("/message")
    public String test(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("portNumber", portNumber);
        model.addAttribute("message", getClass().getSimpleName());
        return "home";
    }
}
