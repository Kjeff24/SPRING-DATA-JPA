package com.kjeffcoding.jpa.repositories;

import com.kjeffcoding.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
