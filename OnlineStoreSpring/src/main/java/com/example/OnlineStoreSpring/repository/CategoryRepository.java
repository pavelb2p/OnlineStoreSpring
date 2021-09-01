package com.example.OnlineStoreSpring.repository;

import com.example.OnlineStoreSpring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
