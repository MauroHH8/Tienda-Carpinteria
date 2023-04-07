package com.tienda.web.tiendacarpinteria.controller;

import java.time.OffsetDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tienda.web.tiendacarpinteria.api.OrdersApiDelegate;
import com.tienda.web.tiendacarpinteria.model.EmptyResponseDTO;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderListDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ResponseContainerResponseDTO;
import com.tienda.web.tiendacarpinteria.service.OrderAdministrationService;

public class OrderController extends BaseController implements OrdersApiDelegate {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

	private OrderAdministrationService orderAdministrationService;
	
	public OrderController(OrderAdministrationService theOrderAdministrationService) {
		orderAdministrationService = theOrderAdministrationService;
	}
	
	
	
	@Override
	public ResponseEntity<ResponseContainerResponseDTO> buyOrder(Long orderId) {
		// TODO Auto-generated method stub
		return OrdersApiDelegate.super.buyOrder(orderId);
	}

	@Override
	public ResponseEntity<ResponseContainerResponseDTO> createOrder(OrderRequestDTO orderRequestDTO) {
		Long start = System.currentTimeMillis();
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			OrderDTO response = orderAdministrationService.create(orderRequestDTO);
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.CREATED).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred creating a order: \"%s\" ", orderRequestDTO), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
	}

	@Override
	public ResponseEntity<ResponseContainerResponseDTO> deleteOrder(Long orderId) {
		Long start = System.currentTimeMillis();
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			orderAdministrationService.delete(orderId);
			EmptyResponseDTO response = new EmptyResponseDTO();
			response.setDate(OffsetDateTime.now());
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.OK).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred deleting a order: \"%s\" ", orderId), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
	}

	@Override
	public ResponseEntity<ResponseContainerResponseDTO> retrieveCart(Long orderId) {
		Long start = System.currentTimeMillis();
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			OrderDTO response = orderAdministrationService.retrieve(orderId);
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.OK).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred retrieving order: \"%d\" ", orderId), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
		
	}
	
	@Override
	public ResponseEntity<ResponseContainerResponseDTO> retrieveAllOrders() {
		Long start = System.currentTimeMillis();
		ResponseContainerResponseDTO responseContainer = new ResponseContainerResponseDTO();
		try {
			List<OrderDTO> order = orderAdministrationService.retrieveAll();
			OrderListDTO response = new OrderListDTO();
			response.setItems(order);
			responseContainer.data(response);
			responseContainer.setMeta(buildMeta(start));
			return ResponseEntity.status(HttpStatus.OK).body(responseContainer);
		} catch (Exception e) {
			LOGGER.error(String.format("An error occurred retrieve all orders"), e);
			return buildErrorResponse(responseContainer, HttpStatus.BAD_REQUEST, e, "A1", start);
		}
	}
	

	

}
