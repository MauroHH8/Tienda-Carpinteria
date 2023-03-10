package com.tienda.web.tiendacarpinteria.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tienda.web.tiendacarpinteria.api.UsersApiDelegate;
import com.tienda.web.tiendacarpinteria.model.ResponseContainerResponseDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserListDTO;
import com.tienda.web.tiendacarpinteria.model.UserRequestDTO;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationService;



public class UserController extends BaseController implements UsersApiDelegate {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	private UserAdministrationService userAdministrationService;
	
	public UserController(UserAdministrationService theUserAdministrationService) {
		userAdministrationService = theUserAdministrationService;
	}


	public ResponseEntity<ResponseContainerResponseDTO> createUser(UserRequestDTO userDTO) {
		Long start = System.currentTimeMillis();
		LOGGER.debug("CREATE");
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			UserDTO response = userAdministrationService.create(userDTO);
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.CREATED).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred creating a user: \"%s\" ", userDTO), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
	}
	
	
	public ResponseEntity<ResponseContainerResponseDTO> retrieveAllUsers() {
		Long start = System.currentTimeMillis();
		LOGGER.debug("LISTAR");
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			List<UserDTO> listUser = userAdministrationService.retrieveAll();
			UserListDTO response = new UserListDTO();
			response.setItems(listUser);
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.CREATED).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred listing uses"), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
	}

}
