package com.tienda.web.tiendacarpinteria.service;

import java.util.List;

import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;

public interface OrderAdministrationService extends CrudAdministrationService <OrderDTO, OrderRequestDTO, Long>{
	
	List<OrderEntity> retrieveByUser (UserEntity user);
}
