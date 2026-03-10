package com.blinkit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private List<String> products = new ArrayList<>();

    public List<String> getAllProducts() {
        return products;
    }

    public String addProduct(String product) {
        products.add(product);
        return "Product added successfully";
    }
}