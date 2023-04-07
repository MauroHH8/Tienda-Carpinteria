package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

	List<ProductEntity> findByCategory(ProductEntity parentCategory);
	
}
