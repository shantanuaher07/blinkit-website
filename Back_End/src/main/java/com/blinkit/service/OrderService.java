package com.blinkit.service;

import com.blinkit.model.Order;
import com.blinkit.model.Product;
import com.blinkit.repository.OrderRepository;
import com.blinkit.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order placeOrder(Order order) {

        Product product = productRepository.findById((long) order.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        double total = product.getPrice() * order.getQuantity();

        order.setTotalPrice(total);

        return orderRepository.save(order);
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}