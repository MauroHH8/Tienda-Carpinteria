package com.tienda.web.tiendacarpinteria.service.mapper;

import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;

public interface OrderMapper {

	OrderEntity map(final OrderDTO theOrder);
	
	OrderDTO map(final OrderEntity theOrder);
	
	OrderRequestDTO mapReq(final OrderEntity theOrder);
	
	OrderEntity mapReq(final OrderRequestDTO theOrder);
	
}

