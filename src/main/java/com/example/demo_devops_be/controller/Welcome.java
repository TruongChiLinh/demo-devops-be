package com.example.demo_devops_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
    @GetMapping("/")
    public String Welcome() {
        return "hello";
    }
    }
