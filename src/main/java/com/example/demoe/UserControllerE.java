package com.example.demoe;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerE {

    @GetMapping("/error")
    public String showError() {
        throw new RuntimeException("Something went wrong!");
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleError(RuntimeException ex) {
        return "Error: " + ex.getMessage();
    }
}
