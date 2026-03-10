package com.blinkit.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    List<String> users = new ArrayList<>();

    @PostMapping("/signup")
    public String signup(@RequestBody String user) {
        users.add(user);
        return "User Registered Successfully";
    }

    @GetMapping
    public List<String> getUsers() {
        return users;
    }
}