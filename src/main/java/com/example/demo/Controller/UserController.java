package com.example.demo.Controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    // 1. @PathVariable
    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "User ID: " + id;
    }

    // 2. @RequestParam
    @GetMapping("/search")
    public String searchUsers(@RequestParam String role,
                              @RequestParam(defaultValue = "1") int page) {
        return "Role: " + role + ", Page: " + page;
    }

    // 3. @RequestBody
    @PostMapping("/create")
    public String createUser(@RequestBody Map<String, Object> user) {
        return "User created: " + user;
    }

    // 4. @RequestHeader
    @GetMapping("/header")
    public String getHeader(
            @RequestHeader("User-Agent") String userAgent) {
        return "User-Agent: " + userAgent;
    }

    // 5. CookieValue
    @GetMapping("/cookie")
    public String getCookie(
            @CookieValue(value = "username",
                         defaultValue = "Guest") String username) {
        return "Username from Cookie: " + username;
    }

    //6. ModelAttribute
    @GetMapping("/form")
    public String getFormData(@ModelAttribute UserForm form) {
        return "Name: " + form.getName()
                + ", Age: " + form.getAge();
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Ali!";
    }

    @GetMapping("/helloo") // ResponseBody به طور پیش فرض
    public String helloo() {  // حتی اگر @ResponseBody را حذف کنیم، نتیجه را به ما برمیگردونه
        return "Hello Ali!";
    }

    @GetMapping("/Jason")
    @ResponseStatus(HttpStatus.CREATED)
    public String getUsersStatus() {
        return "User Status Created Successfully";
    }

    @PostMapping("/usersa")
    public String createUsera(@Valid @RequestBody Usera userb) {
        return "User created: " + userb.getNameaa();
    }


}

