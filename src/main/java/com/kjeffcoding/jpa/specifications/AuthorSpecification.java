package com.kjeffcoding.jpa.specifications;

import com.kjeffcoding.jpa.models.Author;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {
    public static Specification<Author> hasAge(int age){
        return ((root, query, criteriaBuilder) -> {
            if(age < 0){
                return null;
            }
            return criteriaBuilder.equal(root.get("age"), age);
        });
    }

    public static Specification<Author> firstNameLike(String firstName){
        return ((root, query, criteriaBuilder) -> {
            if(firstName == null){
                return null;
            }
            return criteriaBuilder.like(root.get("firstName"), "%" + firstName + "%");
        });
    }
}
