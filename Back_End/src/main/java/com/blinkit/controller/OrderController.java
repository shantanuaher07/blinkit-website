package com.blinkit.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    List<String> orders = new ArrayList<>();

    @PostMapping("/place")
    public String placeOrder(@RequestBody String order) {
        orders.add(order);
        return "Order placed successfully";
    }

    @GetMapping
    public List<String> getOrders() {
        return orders;
    }
}