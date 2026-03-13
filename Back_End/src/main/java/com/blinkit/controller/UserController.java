package com.blinkit.controller;

import com.blinkit.model.User;
import com.blinkit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    // SIGNUP API
    @PostMapping("/signup")
    public String signup(@RequestBody User user) {

        repository.save(user);

        return "User Registered Successfully";
    }

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existingUser = repository.findByEmail(user.getEmail());

        if(existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login Successful";
        }

        return "Invalid Email or Password";
    }

}