package com.tienda.web.tiendacarpinteria.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tienda.web.tiendacarpinteria.db.entity.CategoryEntity;
import com.tienda.web.tiendacarpinteria.db.repository.CategoryRepository;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryRequestDTO;
import com.tienda.web.tiendacarpinteria.service.mapper.CategoryMapper;

public class CategoryAdministrationServiceImpl implements CategoryAdministrationService {

	
private static final Logger LOGGER = LoggerFactory.getLogger(ProductAdministrationServiceImpl.class);
	
	private CategoryRepository categoryRepository;
	
	private CategoryMapper categoryMapper;
	
	public CategoryAdministrationServiceImpl(final CategoryMapper theCategoryMapper, 
			final CategoryRepository theCategoryRepository) {
		categoryRepository = theCategoryRepository;
		categoryMapper = theCategoryMapper;
	}

	@Override
	public List<CategoryDTO> retrieveAll() throws RuntimeException {
		LOGGER.trace(String.format("Listing all categories"));
		Iterable<CategoryEntity> products = categoryRepository.findAll();
		Iterator<CategoryEntity> iter = products.iterator();
		List<CategoryDTO> response = new ArrayList<>();
		while (iter.hasNext()) {
			response.add(categoryMapper.map(iter.next()));
		}
		return response;
	}

	@Override
	public CategoryDTO retrieve(Long id) throws RuntimeException {
		return null;
	}

	@Override
	public CategoryDTO create(CategoryRequestDTO element) throws RuntimeException {
		return null;
	}

	@Override
	public CategoryDTO update(CategoryDTO element) throws RuntimeException {
		return null;
	}

	@Override
	public void delete(Long id) throws RuntimeException {

	}

	@Override
	public List<CategoryDTO> retrieveChildren(Long id) throws RuntimeException {
		return null;
	}

}
