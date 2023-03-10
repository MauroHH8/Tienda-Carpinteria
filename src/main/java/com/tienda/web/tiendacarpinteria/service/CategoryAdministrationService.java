package com.tienda.web.tiendacarpinteria.service;

import java.util.List;

import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryRequestDTO;

public interface CategoryAdministrationService 
extends CrudAdministrationService<CategoryDTO, CategoryRequestDTO, Long>{

List<CategoryDTO> retrieveChildren(final Long id) throws RuntimeException;
}
