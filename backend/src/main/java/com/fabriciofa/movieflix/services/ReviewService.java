package com.fabriciofa.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabriciofa.movieflix.dto.ReviewDTO;
import com.fabriciofa.movieflix.entities.Movie;
import com.fabriciofa.movieflix.entities.Review;
import com.fabriciofa.movieflix.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	@Autowired
	private AuthService authService;

	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		Review entity  = new Review();
		entity.setText(dto.getText());
		entity.setMovie(new Movie(dto.getMovieId()));
		entity.setUser(authService.authenticated());
		entity = reviewRepository.save(entity);
		return new ReviewDTO(entity);
	}

	@Transactional(readOnly = true)
	public List<ReviewDTO> getMovieReviews(Long id) {
		List<Review> reviews = reviewRepository.findMovieById(id);
		return reviews.stream().map(x -> new ReviewDTO(x)).collect(Collectors.toList());
	}
}
