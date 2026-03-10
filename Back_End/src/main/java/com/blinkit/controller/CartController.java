package com.blinkit.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    List<String> cartItems = new ArrayList<>();

    @PostMapping("/add")
    public String addToCart(@RequestBody String item) {
        cartItems.add(item);
        return "Item added to cart";
    }

    @GetMapping
    public List<String> viewCart() {
        return cartItems;
    }

    @DeleteMapping("/remove")
    public String removeItem(@RequestBody String item) {
        cartItems.remove(item);
        return "Item removed from cart";
    }
}