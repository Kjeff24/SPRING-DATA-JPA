package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Section {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int sectionOrder;

    // ManyToOne relationship between Section and Course
    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonBackReference
    private Course course;
}
