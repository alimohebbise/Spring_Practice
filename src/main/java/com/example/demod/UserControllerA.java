package com.example.demod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerA {

    @GetMapping("/learningHeader")
    public String getHeader(
            @RequestHeader("User-Agent") String userAgent) {

        return "User-Agent: " + userAgent;
    }
}
