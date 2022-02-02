package com.fabriciofa.movieflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fabriciofa.movieflix.dto.MovieByGenreDTO;
import com.fabriciofa.movieflix.dto.MovieDTO;
import com.fabriciofa.movieflix.dto.ReviewDTO;
import com.fabriciofa.movieflix.services.MovieService;
import com.fabriciofa.movieflix.services.ReviewService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ReviewService reviewService;

	@GetMapping
	public ResponseEntity<Page<MovieByGenreDTO>> findAllPaged(@RequestParam(name = "genreId", defaultValue = "0") Long genreId, Pageable pageable) {
		Page<MovieByGenreDTO> page = movieService.findAllPaged(genreId, pageable);
		return ResponseEntity.ok(page);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
		MovieDTO dto = movieService.findById(id);
		return ResponseEntity.ok(dto);
	}

	@GetMapping(value = "/{id}/reviews")
	public ResponseEntity<List<ReviewDTO>> getMovieReviews(@PathVariable Long id) {
		List<ReviewDTO> reviews = reviewService.getMovieReviews(id);
		return ResponseEntity.ok(reviews);
	}
}
