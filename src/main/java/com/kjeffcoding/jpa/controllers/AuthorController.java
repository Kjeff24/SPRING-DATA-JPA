package com.kjeffcoding.jpa.controllers;

import com.kjeffcoding.jpa.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthorController{
    private final AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<?> getAllAuthors(){
        return ResponseEntity.ok(authorService.getAllAuthors());
    }
}
