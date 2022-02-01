package com.fabriciofa.movieflix.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class GenreTests {

	@Test
	public void genreShouldHaveCorrectStructure() {
		Genre genre = new Genre();
		genre.setId(1L);
		genre.setName("Comédia");

		assertNotNull(genre.getId());
		assertNotNull(genre.getName());
		
		assertEquals(0, genre.getMovies().size());
	}
}
