package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/1")
    public User getUser() {
        return new User("Raul Pereira", "12345-6");
    }
}
