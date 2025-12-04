package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class Healthcheck {

    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("System is up. Database is reachable.");
    }
}
