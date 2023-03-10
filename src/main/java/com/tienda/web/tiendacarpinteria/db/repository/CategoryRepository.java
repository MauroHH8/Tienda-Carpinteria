package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.CategoryEntity;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
	
	List<CategoryEntity> findByParent(CategoryEntity parentCategory);
	
	Optional<CategoryEntity> findOneByName(String name);
}
