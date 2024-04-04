package com.kjeffcoding.jpa.repositories;

import com.kjeffcoding.jpa.models.resourceTypes.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
