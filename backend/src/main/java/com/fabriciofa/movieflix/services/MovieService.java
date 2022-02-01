package com.fabriciofa.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabriciofa.movieflix.dto.MovieDTO;
import com.fabriciofa.movieflix.entities.Movie;
import com.fabriciofa.movieflix.repositories.MovieRepository;
import com.fabriciofa.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = movieRepository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Id Not Found"));
		return new MovieDTO(entity);
	}
}
