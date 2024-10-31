package com.registrationapi.registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecker {

    @GetMapping("/health")
    public String checkHealth() {
        return "Application is running";
    }
}