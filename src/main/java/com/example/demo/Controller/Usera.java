package com.example.demo.Controller;

import jakarta.validation.constraints.NotBlank;

public class Usera {

    @NotBlank(message = "Name cannot be empty")
    private String namea;

    public String getNameaa() {
        return namea;
    }

    public void setNameaa(String namea) {
        this.namea = namea;
    }
}
