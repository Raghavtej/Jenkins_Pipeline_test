package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")  // This will respond to requests at the root URL
    public String index() {
        return "Welcome to My Spring Boot Application!";
    }

    @GetMapping("/api/hello")  // Define an API endpoint
    public String hello() {
        return "Hello, World!";
    }
}
