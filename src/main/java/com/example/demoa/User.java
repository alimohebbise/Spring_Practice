package com.example.demoa;

import jakarta.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
