package com.kjeffcoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

//    @ManyToOne
//    @JoinColumn(name = "section_id")
//    @JsonBackReference
//    private Section section;

//    @OneToOne(
//            mappedBy = "lecture",
//            cascade = CascadeType.ALL
//    )
//    @JsonManagedReference
//    private Resource resource;
}
