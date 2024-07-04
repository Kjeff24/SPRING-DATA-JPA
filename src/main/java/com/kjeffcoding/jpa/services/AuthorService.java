package com.kjeffcoding.jpa.services;

import com.kjeffcoding.jpa.models.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<Author> getAllAuthors();
}
