package com.blinkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blinkit.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}