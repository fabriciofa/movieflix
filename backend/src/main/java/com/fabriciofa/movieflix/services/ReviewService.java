package com.fabriciofa.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabriciofa.movieflix.dto.ReviewDTO;
import com.fabriciofa.movieflix.entities.Movie;
import com.fabriciofa.movieflix.entities.Review;
import com.fabriciofa.movieflix.entities.User;
import com.fabriciofa.movieflix.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		Review entity  = new Review();
		entity.setText(dto.getText());
		entity.setMovie(new Movie(dto.getMovieId(), null, null, null, null, null, null));
		entity.setUser(new User());
		entity = reviewRepository.save(entity);
		return new ReviewDTO(entity);
	}
}
