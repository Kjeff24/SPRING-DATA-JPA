package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private Integer age;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;

    // ManyToMany relationship between authors and courses
    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> courses;
}
