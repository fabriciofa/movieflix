package com.fabriciofa.movieflix.entities;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ReviewTests {

	@Test
	public void reviewShouldHaveCorrectStructure() {
		Review review = new Review();
		review.setId(1L);
		review.setMovie(new Movie());
		review.setText("Review for the movie");
		review.setUser(new User());

		assertNotNull(review.getId());
		assertNotNull(review.getMovie());
		assertNotNull(review.getText());
		assertNotNull(review.getUser());
	}
}
