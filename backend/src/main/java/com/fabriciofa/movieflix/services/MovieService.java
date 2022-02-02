package com.fabriciofa.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fabriciofa.movieflix.dto.MovieByGenreDTO;
import com.fabriciofa.movieflix.dto.MovieDTO;
import com.fabriciofa.movieflix.entities.Genre;
import com.fabriciofa.movieflix.entities.Movie;
import com.fabriciofa.movieflix.repositories.GenreRepository;
import com.fabriciofa.movieflix.repositories.MovieRepository;
import com.fabriciofa.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private GenreRepository genreRepository;

	@Transactional(readOnly = true)
	public Page<MovieByGenreDTO> findAllPaged(Long genreId, Pageable pageable) {
		Genre genre =  (genreId == 0) ? null : genreRepository.getOne(genreId);
		Page<Movie> page = movieRepository.findMovieByGenre(genre, pageable);
		return page.map(x -> new MovieByGenreDTO(x));
	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = movieRepository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Id Not Found"));
		return new MovieDTO(entity);
	}
}
