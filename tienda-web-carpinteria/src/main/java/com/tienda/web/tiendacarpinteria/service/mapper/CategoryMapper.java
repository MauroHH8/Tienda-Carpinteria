package com.tienda.web.tiendacarpinteria.service.mapper;

import com.tienda.web.tiendacarpinteria.db.entity.CategoryEntity;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryRequestDTO;

public interface CategoryMapper {
	
	CategoryEntity map(final CategoryRequestDTO theCategory);
	
	CategoryEntity map(final CategoryDTO theCategory);
	
	CategoryDTO map(final CategoryEntity theCategory);
}
