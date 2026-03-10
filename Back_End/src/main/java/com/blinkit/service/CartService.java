package com.blinkit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CartService {

    private List<String> cartItems = new ArrayList<>();

    public String addToCart(String item) {
        cartItems.add(item);
        return "Item added to cart";
    }

    public List<String> getCartItems() {
        return cartItems;
    }

    public String removeFromCart(String item) {
        cartItems.remove(item);
        return "Item removed from cart";
    }
}