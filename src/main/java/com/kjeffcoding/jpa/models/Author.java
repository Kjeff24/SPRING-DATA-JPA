package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@NamedQueries(
        {
            @NamedQuery(
                    name = "Author.findByNamedQuery",
                    query = "select a from Author  a where age >= :age"
            ),
            @NamedQuery(
                    name = "Author.updateNamedQuery",
                    query = "update Author  a set a.age = :age"
            )
        }
)
public class Author extends BaseEntity {

    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private Integer age;

    // ManyToMany relationship between authors and courses
    @ManyToMany(
            mappedBy = "authors",
            fetch = FetchType.EAGER
    )
    @JsonManagedReference
    private List<Course> courses;
}
