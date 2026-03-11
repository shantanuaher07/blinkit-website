package com.blinkit.controller;

import com.blinkit.model.User;
import com.blinkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.registerUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return service.getAllUsers();
    }
}