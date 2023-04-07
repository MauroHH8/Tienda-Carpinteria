package com.tienda.web.tiendacarpinteria.service.mapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tienda.web.tiendacarpinteria.db.entity.OrderDetailsEntity;
import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.utils.DateUtils;

public class OrderMapperImpl implements OrderMapper {

	private UserMapper userMapper;
	private OrderDetailsMapper orderDetailsMapper;
	
	
	
	public OrderMapperImpl(final UserMapper theUserMapper,final OrderDetailsMapper theOrderDetailsMapper) {
		userMapper = theUserMapper;
		orderDetailsMapper = theOrderDetailsMapper;
	}

	@Override
	public OrderEntity map(OrderDTO theOrder) {
		
		OrderEntity response = new OrderEntity();
		
		response.setId(theOrder.getId());
		
		UserEntity toCreate = userMapper.map(theOrder.getUser());
		response.setUser(toCreate);
		
		//Lista a setear
		List <OrderDetailsEntity> createOrderDetails = new ArrayList <OrderDetailsEntity>();
		//Lista que tengo que tranformar
		List <OrderDetailsDTO> orderDetailsList = theOrder.getOrderList();
		//Tranformacion
		for ( OrderDetailsDTO orderDet : orderDetailsList) {
			OrderDetailsEntity aux = orderDetailsMapper.map(orderDet);
			createOrderDetails.add(aux);}
		//Seteado
		response.setDetail(createOrderDetails);
		
		response.setPrice(BigDecimal.valueOf((theOrder.getPrice())));
		
		response.setDateCreated(new Date());
		
		
		return response;
	}

	@Override
	public OrderDTO map(OrderEntity theOrder) {
		
		OrderDTO response = new OrderDTO();
		
		response.setId(theOrder.getId());
		
		UserDTO toCreate = userMapper.map(theOrder.getUser());
		response.setUser(toCreate);
		
		List <OrderDetailsDTO> createOrderDetails = new ArrayList <OrderDetailsDTO>();
		List <OrderDetailsEntity> orderDetailsList = theOrder.getDetail();
		for ( OrderDetailsEntity orderDet : orderDetailsList) {
			OrderDetailsDTO aux = orderDetailsMapper.map(orderDet);
			createOrderDetails.add(aux);}
		response.setOrderList(createOrderDetails);
		
		response.setPrice(theOrder.getPrice().doubleValue());
		
		if (theOrder.getDateCreated() != null) {
			LocalDate createdLocalDate = DateUtils.toLocalDate(theOrder.getDateCreated());
			response.setDateCreated(createdLocalDate);
		}
		
		
		return response;
	}
	
	@Override
	public OrderRequestDTO mapReq(OrderEntity theOrder) {
		
		OrderRequestDTO response = new OrderRequestDTO();
		
		response.setId(theOrder.getId());
		
		
		response.setUser(userMapper.map(theOrder.getUser()));
		
		List <OrderDetailsDTO> createOrderDetails = new ArrayList <OrderDetailsDTO>();
		List <OrderDetailsEntity> orderDetailsList = theOrder.getDetail();
		for ( OrderDetailsEntity orderDet : orderDetailsList) {
			OrderDetailsDTO aux = orderDetailsMapper.map(orderDet);
			createOrderDetails.add(aux);}
		response.setOrderDetails(createOrderDetails);
		
		return null;
	}

	@Override
	public OrderEntity mapReq(OrderRequestDTO theOrder) {
		
		OrderEntity response = new OrderEntity();
		
		response.setId(theOrder.getId());
		
		response.setUser(userMapper.map(theOrder.getUser()));
		
		List <OrderDetailsEntity> createOrderDetails = new ArrayList <OrderDetailsEntity>();
		List <OrderDetailsDTO> orderDetailsList = theOrder.getOrderDetails();
		double totalPrice = 0;
		for ( OrderDetailsDTO orderDet : orderDetailsList) {
			OrderDetailsEntity aux = orderDetailsMapper.map(orderDet);
			createOrderDetails.add(aux);
			ProductDTO productOrderDet = orderDet.getProduct();
			double priceOrderDet = (productOrderDet.getPrice()*productOrderDet.getQty());
			totalPrice = totalPrice + priceOrderDet;
		}
		
		response.setPrice(BigDecimal.valueOf(totalPrice));
		
		response.setDetail(createOrderDetails);
		
		response.setDateCreated(new Date());
		
		/*if (theOrder.getDateDeleted() != null) {
			response.setDateDeleted(DateUtils.toDate(theOrder.getDateDeleted()));
		}*/

		
		return response;
	}
	

}
