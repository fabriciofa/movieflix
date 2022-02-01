package com.fabriciofa.movieflix.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fabriciofa.movieflix.entities.User;
import com.fabriciofa.movieflix.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {
	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if (user == null) {
			logger.error("Username Not Found: " + username);
			throw new UsernameNotFoundException("Username Not Found");
		}
		logger.info("Username Found: " + user.getEmail());
		return user;
	}

}
