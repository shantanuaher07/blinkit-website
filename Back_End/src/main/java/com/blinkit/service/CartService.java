package com.blinkit.service;

import com.blinkit.model.Cart;
import com.blinkit.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository repository;

    public Cart addToCart(Cart cart) {
        return repository.save(cart);
    }

    public List<Cart> getCartItems() {
        return repository.findAll();
    }
}