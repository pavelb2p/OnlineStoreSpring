package com.example.OnlineStoreSpring.repository;

import com.example.OnlineStoreSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByCategory_id(int id);
}
