package com.blinkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blinkit.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}