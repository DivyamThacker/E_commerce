package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
		// Implemented using String Templates
        return """
                { message: Hello World Java v1 }
               """;
    }
}