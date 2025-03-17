package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint to check user credentials
    @GetMapping("/checkCredentials")
    public boolean checkCredentials(@RequestParam String userId, @RequestParam String password) {
        return userService.checkCredentials(userId, password);
    }
}

