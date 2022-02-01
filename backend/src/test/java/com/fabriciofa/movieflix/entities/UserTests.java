package com.fabriciofa.movieflix.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class UserTests {

	@Test
	public void userShouldHaveCorrectStructure() {
		User user = new User();
		user.setId(1L);
		user.setName("Fabricio");
		user.setEmail("fabricio@gmail.com");
		user.setPassword("root");
		
		assertNotNull(user.getId());
		assertNotNull(user.getName());
		assertNotNull(user.getEmail());
		assertNotNull(user.getPassword());
		
		assertEquals(0, user.getRoles().size());
		assertEquals(0, user.getReviews().size());
	}
}
