package com.blinkit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private List<String> orders = new ArrayList<>();

    public String placeOrder(String order) {
        orders.add(order);
        return "Order placed successfully";
    }

    public List<String> getOrders() {
        return orders;
    }
}