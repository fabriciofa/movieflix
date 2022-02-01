package com.fabriciofa.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.fabriciofa.movieflix.dto.UserDTO;
import com.fabriciofa.movieflix.entities.User;
import com.fabriciofa.movieflix.repositories.UserRepository;
import com.fabriciofa.movieflix.services.exceptions.ForbiddenException;
import com.fabriciofa.movieflix.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid Access");
		}
	}

	public boolean getCurrentLoggedUser(Long userId) {
		User user = authenticated();
		if (!user.getId().equals(userId)) {
			throw new ForbiddenException("Access Denied");
		}
		return true;
	}

	public UserDTO getAuthenticatedUser() {
		return new UserDTO(authenticated());
	}
}
