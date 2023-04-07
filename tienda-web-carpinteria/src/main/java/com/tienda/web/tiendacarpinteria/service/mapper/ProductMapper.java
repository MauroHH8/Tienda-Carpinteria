package com.tienda.web.tiendacarpinteria.service.mapper;

import com.tienda.web.tiendacarpinteria.db.entity.ProductEntity;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.ProductRequestDTO;

public interface ProductMapper {

	ProductEntity map(final ProductRequestDTO theProduct);
	
	ProductEntity map(final ProductDTO theProduct);
	
	ProductDTO map(final ProductEntity theProduct);
	
	
	
	
}

