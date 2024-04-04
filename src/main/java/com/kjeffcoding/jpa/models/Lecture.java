package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Lecture extends BaseEntity{

    private String name;

    // ManyToOne relationship between Lecture and Section
    @ManyToOne
    @JoinColumn(name = "section_id")
    @JsonBackReference
    private Section section;

    // OneToOne relationship between Lecture and Resource
    @OneToOne(
            mappedBy = "lecture"
    )
    @JoinColumn(name = "resource_id")
    @JsonManagedReference
    private Resource resource;
}
