package com.tienda.web.tiendacarpinteria.service.mapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tienda.web.tiendacarpinteria.db.entity.ProductEntity;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.ProductRequestDTO;
import com.tienda.web.tiendacarpinteria.service.UserAdministrationServiceImpl;
import com.tienda.web.tiendacarpinteria.utils.DateUtils;

public class ProductMapperImpl implements ProductMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAdministrationServiceImpl.class);
	
	private CategoryMapper categoryMapper;
	
	public ProductMapperImpl(CategoryMapper theCategoryMapper) {
		categoryMapper = theCategoryMapper;
	}

	public ProductEntity map(final ProductDTO theProduct) {
		LOGGER.trace(String.format("Mapping ProductEntity with attributes: %s to: ProductDTO", theProduct.toString()));
		ProductEntity response = new ProductEntity();
		response.setId(theProduct.getId());
		response.setPrice(BigDecimal.valueOf(theProduct.getPrice()));
		response.setQuantity(theProduct.getQty());
		response.setDescription(theProduct.getDescription());
		response.setCategory(categoryMapper.map(theProduct.getCategory()));
		if (theProduct.getDateCreated() != null) {
			response.setDateCreated(DateUtils.toDate(theProduct.getDateCreated()));
		}
		return response;
	}
	

	public ProductDTO map(final ProductEntity theProduct) {
		LOGGER.trace(String.format("Mapping ProductDTO with attributes: %s to: ProductEntity", theProduct.toString()));
		ProductDTO response = new ProductDTO();
		response.setId(theProduct.getId());
		response.setPrice(theProduct.getPrice().doubleValue());
		response.setQty(theProduct.getQuantity());
		response.setDescription(theProduct.getDescription());
		response.setCategory(categoryMapper.map(theProduct.getCategory()));
		if (theProduct.getDateCreated() != null) {
			LocalDate createdLocalDate = DateUtils.toLocalDate(theProduct.getDateCreated());
			response.setDateCreated(createdLocalDate);
		}
		return response;
	}

	
	public ProductEntity map(ProductRequestDTO theProduct) {
		LOGGER.trace(String.format("Mapping ProductEntity with attributes: %s to: ProductDTO", theProduct.toString()));
		ProductEntity response = new ProductEntity();
		
		response.setPrice(BigDecimal.valueOf(theProduct.getPrice()));
		response.setQuantity(theProduct.getQty());
		response.setDescription(theProduct.getDescription());
		response.setCategory(categoryMapper.map(theProduct.getCategory()));
		response.setDateCreated(new Date());
		
		return response;
	}

}

