package com.tienda.web.tiendacarpinteria.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserRoleEnum;
import com.tienda.web.tiendacarpinteria.db.repository.UserRepository;

public class UserInitializationServiceImpl implements UserInitializationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserInitializationServiceImpl.class);
	
	private UserRepository userRepository;
	
	private PasswordEncoder encoder;
	
	@Value("${api.defaultuser.dni}")
	private Integer dni;
	@Value("${api.defaultuser.firstName}")
	private String firstName;
	@Value("${api.defaultuser.lastname}")
	private String lastname;
	@Value("${api.defaultuser.dob}")
	private Date dob;
	@Value("${api.defaultuser.address}")
	private String address;
	@Value("${api.defaultuser.email}")
	private String email;
	@Value("${api.defaultuser.password}")
	private String password;
	
	public UserInitializationServiceImpl(PasswordEncoder theEncoder, UserRepository theUserRepository) {
		userRepository = theUserRepository;
		encoder = theEncoder;
	}

	@Override
	public void createDefaultAdminUser() {
		if (userRepository.count() == 0) {
			UserEntity adminUser = new UserEntity();
			adminUser.setFirstName(firstName);
			adminUser.setLastName(lastname);
			adminUser.setEmail(email);
			adminUser.setDni(dni);
			adminUser.setDob(dob);
			adminUser.setAddress(address);
			adminUser.setRole(UserRoleEnum.ROLE_ADMIN);
			adminUser.setPassword(encoder.encode(password));
			adminUser.setDateCreated(new Date());
			userRepository.save(adminUser);
		}
		
	}

}
