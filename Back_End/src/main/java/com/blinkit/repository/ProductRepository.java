package com.blinkit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blinkit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}