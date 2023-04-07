package com.tienda.web.tiendacarpinteria.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.db.repository.UserRepository;

public class UserDetailServiceImpl implements UserDetailService {

	private UserRepository userRepository;
		
	public UserDetailServiceImpl(UserRepository theUserRepository) {
		userRepository = theUserRepository;
	}

	/**
	 * Required to check authorities
	 */
	@Override
	public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
		UserEntity user = findByEmail(email);
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(user.getRole().name()));
		UserDetails userDetails = new User(user.getEmail(), user.getPassword(), authorities);
		return userDetails;
	}
	
	private UserEntity findByEmail(final String email) {
		Optional<UserEntity> opUsr = userRepository.findOneByEmail(email);
		if (opUsr.isEmpty()) {
			throw new RuntimeException("User not found");
		}
		return opUsr.get();
	}
}

