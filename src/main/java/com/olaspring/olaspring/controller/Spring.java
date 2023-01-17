package com.olaspring.olaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ola")
public class Spring {

    @GetMapping
    public String sendMessage() {
        return "Olá Spring";
    }
}
