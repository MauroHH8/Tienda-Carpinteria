package com.tienda.web.tiendacarpinteria.service.mapper;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tienda.web.tiendacarpinteria.db.entity.CategoryEntity;
import com.tienda.web.tiendacarpinteria.db.repository.CategoryRepository;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryRequestDTO;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.utils.DateUtils;

public class CategoryMapperImpl implements CategoryMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAdministrationServiceImpl.class);
	
	private CategoryRepository categoryRepository;
	
	public CategoryMapperImpl(final CategoryRepository theCategoryRepository) {
		categoryRepository = theCategoryRepository;
	}

	public CategoryEntity map(final CategoryDTO theCategory) {
		LOGGER.trace(String.format("Mapping CategoryEntity with attributes: %s to: CategoryDTO", theCategory.toString()));
		CategoryEntity response = new CategoryEntity();
		response.setId(theCategory.getId());
		response.setName(theCategory.getName());
		Long parentCategoryId = theCategory.getParentCategoryId();
		if (parentCategoryId != null && parentCategoryId > 0) {
			Optional<CategoryEntity> opParent = categoryRepository.findById(parentCategoryId);
			if (opParent.isEmpty()) {
				throw new RuntimeException(String.format("The parent category %d was not found", parentCategoryId));
			}
			CategoryEntity parent = opParent.get();
			response.setParent(parent);
		}
		
		if (theCategory.getDateCreated() != null) {
			response.setDateCreated(DateUtils.toDate(theCategory.getDateCreated()));
		}
		
		return response;
	}
	

	public CategoryDTO map(final CategoryEntity theCategory) {
		LOGGER.trace(String.format("Mapping CategoryDTO with attributes: %s to: CategoryEntity", theCategory.toString()));
		CategoryDTO response = new CategoryDTO();
		response.setId(theCategory.getId());
		response.setName(theCategory.getName());
		if (theCategory.getParent() != null) {
			response.setParentCategoryId(theCategory.getParent().getId());	
		}
		if (theCategory.getDateCreated() != null) {
			LocalDate createdLocalDate = DateUtils.toLocalDate(theCategory.getDateCreated());
			response.setDateCreated(createdLocalDate);
		}
		
		return response;
	}

	@Override
	public CategoryEntity map(CategoryRequestDTO theCategory) {
		LOGGER.trace(String.format("Mapping CategoryEntity with attributes: %s to: CategoryRequestDTO", theCategory.toString()));
		CategoryEntity response = new CategoryEntity();
		response.setName(theCategory.getName());
		Long parentCategoryId = theCategory.getParentCategoryId();
		if (parentCategoryId != null && parentCategoryId > 0) {
			Optional<CategoryEntity> opParent = categoryRepository.findById(parentCategoryId);
			if (opParent.isEmpty()) {
				throw new RuntimeException(String.format("The parent category %d was not found", parentCategoryId));
			}
			CategoryEntity parent = opParent.get();
			response.setParent(parent);
		}
		response.setDateCreated(new Date());
		
		return response;
	}

	
}