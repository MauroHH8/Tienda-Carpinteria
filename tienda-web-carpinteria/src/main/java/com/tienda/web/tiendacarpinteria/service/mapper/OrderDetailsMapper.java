package com.tienda.web.tiendacarpinteria.service.mapper;

import com.tienda.web.tiendacarpinteria.db.entity.OrderDetailsEntity;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;

public interface OrderDetailsMapper {
	
	OrderDetailsEntity map(final OrderDetailsDTO theOrder);
	
	OrderDetailsDTO map(final OrderDetailsEntity theOrder);
	


}
