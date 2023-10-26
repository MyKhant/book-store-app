package com.example.bookstoreapp.dao;

import com.example.bookstoreapp.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Integer> {
}
