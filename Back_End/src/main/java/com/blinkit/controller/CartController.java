package com.blinkit.controller;

import com.blinkit.model.Cart;
import com.blinkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    // Add product to cart
    @PostMapping("/add")
    public Cart addToCart(@RequestBody Cart cart) {
        return service.addToCart(cart);
    }

    // View cart
    @GetMapping("/all")
    public List<Cart> getCartItems() {
        return service.getCartItems();
    }
}