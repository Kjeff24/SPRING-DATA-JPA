package com.kjeffcoding.jpa;

import com.github.javafaker.Faker;
import com.kjeffcoding.jpa.models.Author;
import com.kjeffcoding.jpa.repositories.AuthorRepository;
import com.kjeffcoding.jpa.repositories.VideoRepository;
import com.kjeffcoding.jpa.specifications.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository){

		return args -> {
			// Create Authors
			/*for(int i = 1; i<60; i++){
				Faker faker = new Faker();
				String firstName = faker.name().firstName();
				String lastName = faker.name().lastName();
				int age = faker.number().numberBetween(12,40);
				String email = (firstName + "." + lastName + "@gmail.com");
				var author = Author.builder()
						.firstName(firstName)
						.lastName(lastName)
						.age(age)
						.email(email)
						.build();
				authorRepository.save(author);
			}*/

			/*var video = Video.builder()
					.name("Take It Back")
					.length(5)
					.build();
			videoRepository.save(video);*/

			// Update author
			/*var author = Author.builder()
					.id(1)
					.firstName("Jeffery")
					.lastName("arthur")
					.age(23)
					.email("jeffreyarthur123@gmail.com")
					.build();
			authorRepository.save(author);*/

			// update author using custom query in AuthorRepository
			/*authorRepository.updateAuthor(20, 1);*/

			// find by named query
			/*authorRepository.findByNamedQuery(20)
					.forEach(System.out::println);*/

			// Update all by named query
			/*authorRepository.updateNamedQuery(19);*/

			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(17))
					.and(AuthorSpecification.firstNameLike("Ma"));

			authorRepository.findAll(spec)
					.forEach(System.out::println);
		};
	}

}
