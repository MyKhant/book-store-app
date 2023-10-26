package com.example.bookstoreapp.dao;

import com.example.bookstoreapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
