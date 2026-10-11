package com.example.democ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/learningrestcontroller")
    public String getUser() {
        return "Hello Ali!";
    }
}
