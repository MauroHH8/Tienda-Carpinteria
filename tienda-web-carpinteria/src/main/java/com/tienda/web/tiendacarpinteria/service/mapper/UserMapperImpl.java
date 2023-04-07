package com.tienda.web.tiendacarpinteria.service.mapper;

import java.time.LocalDate;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserRoleEnum;
import com.tienda.web.tiendacarpinteria.model.CartUserDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserRequestDTO;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.utils.DateUtils;


public class UserMapperImpl implements UserMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAdministrationServiceImpl.class);
	
	private PasswordEncoder encoder;
	
	public UserMapperImpl(PasswordEncoder theEncoder) {
		encoder = theEncoder;
	}

	//DTO to Entity:
	
	public UserEntity map(final UserDTO theUser) {
		LOGGER.trace(String.format("Mapping UserDTO with attributes: %s to: UserEntity", theUser.toString()));
		UserEntity response = new UserEntity();
		response.setDni(theUser.getDni());
		response.setAddress(theUser.getAddress());
		response.setPassword(theUser.getPassword());
		response.setFirstName(theUser.getFirstName());
		response.setLastName(theUser.getLastName());
		response.setEmail(theUser.getEmail());
		if (theUser.getDateOfBirthday() != null) {
			response.setDob(DateUtils.toDate(theUser.getDateOfBirthday()));
		}
		if (theUser.getDateCreated() != null) {
			response.setDateCreated(DateUtils.toDate(theUser.getDateCreated()));
		}
		if (theUser.getDateDeleted() != null) {
			response.setDateDeleted(DateUtils.toDate(theUser.getDateDeleted()));
		}
		response.setRole(UserRoleEnum.ROLE_USER);
		
		return response;
	}
	
	//Entity to DTO:
	
	public UserDTO map(final UserEntity theUser) {
		LOGGER.trace(String.format("Mapping UserDTO with attributes: %s to: UserEntity", theUser.toString()));
		UserDTO response = new UserDTO();
		response.setDni(theUser.getDni());
		response.setAddress(theUser.getAddress());
		response.setPassword(theUser.getPassword());
		response.setFirstName(theUser.getFirstName());
		response.setLastName(theUser.getLastName());
		response.setEmail(theUser.getEmail());
		if (theUser.getDob() != null) {
			response.setDateOfBirthday(DateUtils.toLocalDate(theUser.getDob()));
		}
		if (theUser.getDateCreated() != null) {
			LocalDate createdLocalDate = DateUtils.toLocalDate(theUser.getDateCreated());
			response.setDateCreated(createdLocalDate);
		}
		if (theUser.getDateDeleted() != null) {
			LocalDate deletedLocalDate = DateUtils.toLocalDate(theUser.getDateDeleted());
			response.setDateDeleted(deletedLocalDate);
		}
		
		return response;
	}

	public UserEntity mapEncoded(final UserDTO theUser) {
		LOGGER.trace(String.format("Mapping encoded UserDTO with attributes: %s to: UserEntity", theUser.toString()));
		UserEntity response = new UserEntity();
		response.setDni(theUser.getDni());
		response.setAddress(theUser.getAddress());
		response.setPassword(theUser.getPassword());
		response.setFirstName(theUser.getFirstName());
		response.setLastName(theUser.getLastName());
		response.setEmail(theUser.getEmail());
		if (theUser.getDateOfBirthday() != null) {
			response.setDob(DateUtils.toDate(theUser.getDateOfBirthday()));
		}
		if (theUser.getDateCreated() != null) {
			response.setDateCreated(DateUtils.toDate(theUser.getDateCreated()));
		}
		if (theUser.getDateDeleted() != null) {
			response.setDateDeleted(DateUtils.toDate(theUser.getDateDeleted()));
		}
		response.setRole(UserRoleEnum.ROLE_USER);
		
		return response;
	}
	
	public UserEntity mapEncoded(final UserRequestDTO theUser) {
		LOGGER.trace(String.format("Mapping encoded UserRequestDTO with attributes: %s to: UserEntity", theUser.toString()));
		UserEntity response = new UserEntity();
		response.setDni(theUser.getDni());
		response.setAddress(theUser.getAddress());
		response.setPassword(theUser.getPassword());
		response.setFirstName(theUser.getFirstName());
		response.setLastName(theUser.getLastName());
		response.setEmail(theUser.getEmail());
		if (theUser.getDateCreated() != null) {
			response.setDob(DateUtils.toDate(theUser.getDateOfBirthday()));
		}
		response.setDateCreated(new Date());
		response.setRole(UserRoleEnum.ROLE_USER);
		return response;
	}

	@Override
	public UserEntity fill(UserDTO source, UserEntity target) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

