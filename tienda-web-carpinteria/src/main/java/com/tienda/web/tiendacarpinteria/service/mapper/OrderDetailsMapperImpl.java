package com.tienda.web.tiendacarpinteria.service.mapper;

import java.math.BigDecimal;
import java.util.Date;

import com.tienda.web.tiendacarpinteria.db.entity.OrderDetailsEntity;
import com.tienda.web.tiendacarpinteria.db.entity.ProductEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.utils.DateUtils;

public class OrderDetailsMapperImpl implements OrderDetailsMapper {

	private UserMapper userMapper;
	private ProductMapper productMapper;
	
	
	
	public OrderDetailsMapperImpl(UserMapper theUserMapper, ProductMapper theProductMapper) {
		userMapper = theUserMapper;
		productMapper = theProductMapper;
		
	}


	public OrderDetailsEntity map(OrderDetailsDTO theOrder) {
		
		OrderDetailsEntity response = new OrderDetailsEntity();
		
		response.setId(theOrder.getId());
		
		UserEntity toCreate = userMapper.map(theOrder.getUser());
		response.setUser(toCreate);
		
		ProductDTO theProduct = theOrder.getProduct();
		response.setProduct(productMapper.map(theProduct));
	
		BigDecimal price = BigDecimal.valueOf((theProduct.getPrice()) * (theProduct.getQty()));
		response.setPrice(price);
		
		//response.setOrder(orderMapper.mapReq(theOrder.getOrder())); 
		
		response.setDateCreated(new Date());
	
		return response;
	}


	public OrderDetailsDTO map(OrderDetailsEntity theOrder) {
		
		OrderDetailsDTO response = new OrderDetailsDTO ();
		
		response.setId(theOrder.getId());
		
		UserDTO toCreate = userMapper.map(theOrder.getUser());
		response.setUser(toCreate);
		
		ProductEntity theProduct = theOrder.getProduct();
		response.setProduct(productMapper.map(theProduct));
		
		//response.setOrder(orderMapper.mapReq(theOrder.getOrder())); 
		
		if(theOrder.getDateCreated() != null) {
			response.setDateCreated(DateUtils.toLocalDate(theOrder.getDateCreated()));
		};
		
		return response;
	}
	

}
