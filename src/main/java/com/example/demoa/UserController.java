package com.example.demoa;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController

    public class UserController {

    @PostMapping("/usersvalid")
    public String createUser(@Valid @RequestBody User user) {
        return "User created: " + user.getName();
    }

}