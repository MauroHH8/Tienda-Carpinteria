package com.tienda.web.tiendacarpinteria.service;

import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserRequestDTO;

/**
 * Esta es una capa de negocios para atender los requerimientos del controllador de usuarios.
 */
public interface UserAdministrationService 
	extends CrudAdministrationService<UserDTO, UserRequestDTO, Integer> {


}
