package com.kjeffcoding.jpa;

import com.kjeffcoding.jpa.models.Author;
import com.kjeffcoding.jpa.models.resourceTypes.Video;
import com.kjeffcoding.jpa.repositories.AuthorRepository;
import com.kjeffcoding.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

//	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository){
		return args -> {
			/*var author = Author.builder()
					.firstName("Jeffery")
					.lastName("Arthur")
					.age(12)
					.email("jeffreyarthur123@gmail.com")
					.build();*/
			var video = Video.builder()
					.name("Take It Back")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
