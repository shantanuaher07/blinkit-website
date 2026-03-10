package com.blinkit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<String> users = new ArrayList<>();

    public String registerUser(String user) {
        users.add(user);
        return "User registered successfully";
    }

    public List<String> getUsers() {
        return users;
    }
}