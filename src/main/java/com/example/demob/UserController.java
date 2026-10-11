package com.example.demob;

import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usersb")
@Validated
public class UserController {

    @GetMapping("/age")
    public String checkAge(
            @RequestParam
            @Min(value = 18, message = "Age must be at least 18")
            int age) {

        return "Your age is: " + age;
    }
}
