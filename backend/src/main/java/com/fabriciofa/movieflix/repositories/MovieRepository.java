package com.fabriciofa.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fabriciofa.movieflix.entities.Genre;
import com.fabriciofa.movieflix.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("SELECT obj "
			+ "FROM Movie obj "
			+ "WHERE (COALESCE(:genre) IS NULL OR obj.genre = :genre)")
	Page<Movie> findMovieByGenre(Genre genre, Pageable pageable);
}
