package com.tienda.web.tiendacarpinteria.service.mapper;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.model.CartUserDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserRequestDTO;

public interface UserMapper {
	
		UserEntity map(final UserDTO theUser);
		
		UserEntity mapEncoded(final UserDTO theUser);
		
		UserEntity mapEncoded(final UserRequestDTO theUser);
		
		UserDTO map(final UserEntity theUser);
		
		UserEntity fill(final UserDTO source, final UserEntity target);
	}



