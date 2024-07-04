package com.kjeffcoding.jpa.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjeffcoding.jpa.models.Author;
import com.kjeffcoding.jpa.services.AuthorService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AuthorController.class)
@AutoConfigureMockMvc
//@ExtendWith(MockitoExtension.class)
class AuthorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AuthorService authorService;

    @Autowired
    private ObjectMapper objectMapper;
    private List<Author> authors;

    @BeforeEach
    void setUp() {
        Author author1 = new Author();
        author1.setFirstName("John");
        Author author2 = new Author();
        author1.setFirstName("James");
        authors = Arrays.asList(author1, author2);
    }

    @Test
    void getAllAuthors() throws Exception {
        when(authorService.getAllAuthors()).thenReturn(authors);

        ResultActions response = mockMvc.perform(get("/api/v1/authors")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());

//        System.out.println(authors);
        response.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}