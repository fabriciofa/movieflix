package com.fabriciofa.movieflix.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MovieTests {

	@Test
	public void movieShouldHaveCorrectStructure() {
		Movie movie = new Movie();
		movie.setId(1L);
		movie.setTitle("Movie Title");
		movie.setSubTitle("Movie Subtitle");
		movie.setYear(2022);
		movie.setImgUrl("https://google.com");
		movie.setSynopsis("A movie about a movie");
		movie.setGenre(new Genre());

		assertNotNull(movie.getId());
		assertNotNull(movie.getTitle());
		assertNotNull(movie.getSubTitle());
		assertNotNull(movie.getYear());
		assertNotNull(movie.getImgUrl());
		assertNotNull(movie.getSynopsis());
		assertNotNull(movie.getGenre());

		assertEquals(0, movie.getReviews().size());
	}
}
