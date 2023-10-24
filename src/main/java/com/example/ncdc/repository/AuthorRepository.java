package com.example.ncdc.repository;

import com.example.ncdc.model.AuthorModel;
import com.example.ncdc.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
}
