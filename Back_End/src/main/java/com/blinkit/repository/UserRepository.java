package com.blinkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blinkit.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}