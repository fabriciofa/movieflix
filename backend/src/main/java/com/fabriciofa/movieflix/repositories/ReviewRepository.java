package com.fabriciofa.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabriciofa.movieflix.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findMovieById(Long id);
}
