package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String description;

    // ManyToMany relationship between courses and authors
    @ManyToMany
    @JoinTable(
            name="authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    // OneToMany relationship between Course and Section
    @OneToMany(mappedBy = "course")
    @JsonManagedReference
    private List<Section> sections;

}
