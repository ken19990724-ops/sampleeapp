package com.example.sampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Nova";
    }

    @GetMapping("/error-test")
    public String errorTest() {
        throw new RuntimeException("これは研修用に発生させたテストエラーです");
    }
}