package com.blinkit.service;

import com.blinkit.model.User;
import com.blinkit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User registerUser(User user){
        return repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }
}