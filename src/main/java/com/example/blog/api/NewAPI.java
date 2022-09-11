package com.example.blog.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class NewAPI {
    @GetMapping("/test")
    public String testAPI() {
        return "Success";
    }
}
