package com.fabriciofa.movieflix.entities;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class RoleTests {

	@Test
	public void roleShouldHaveCorrectStructure() {
		Role role = new Role();
		role.setId(1L);
		role.setAuthority("ROLE_MEMBER");

		assertNotNull(role.getId());
		assertNotNull(role.getAuthority());
	}
}
