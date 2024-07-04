package com.kjeffcoding.jpa.repositories;

import com.kjeffcoding.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

    @Modifying
    @Transactional
    @Query("update Author a set a.age=:age where a.id=:id")
    void updateAuthor(int age, int id);

    @Modifying
    @Transactional
    void updateNamedQuery(@Param("age") int age);

    @Transactional
    List<Author> findByNamedQuery(@Param("age") int age);
    List<Author> findAllByFirstName(String firstName);
    List<Author> findAllByFirstNameIgnoreCase(String firstName);
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);


}
