package com.tienda.web.tiendacarpinteria.service;

import java.util.List;
import java.util.Optional;

import com.tienda.web.tiendacarpinteria.db.entity.OrderDetailsEntity;
import com.tienda.web.tiendacarpinteria.db.repository.OrderDetailsRepository;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderDetailsMapper;

public class OrderDetailsAdministrationServiceImpl implements OrderDetailsAdministrationService {

	private OrderDetailsRepository orderDetailsRepository;
	private OrderDetailsMapper orderDetailsMapper;
	
	
	public OrderDetailsAdministrationServiceImpl(OrderDetailsRepository theOrderDetailsRepository,
			OrderDetailsMapper theOrderDetailsMapper) {
		orderDetailsRepository = theOrderDetailsRepository;
		orderDetailsMapper = theOrderDetailsMapper;
	}

	@Override
	public List<OrderDetailsEntity> retrieveAll() throws RuntimeException {
		return (List<OrderDetailsEntity>) orderDetailsRepository.findAll();
	}

	@Override
	public OrderDetailsEntity retrieve(Long orderDetailsId) throws RuntimeException {
		Optional<OrderDetailsEntity> opOrder = orderDetailsRepository.findById(orderDetailsId);
		if (opOrder.isEmpty()) {
			throw new RuntimeException(String.format("The order could not be found under id %d", orderDetailsId));
		}
		return opOrder.get(); 
		
	}

	@Override
	public OrderDetailsEntity update(OrderDetailsEntity element) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailsEntity create(OrderDetailsDTO theOrderDetailsDTO) throws RuntimeException {
		OrderDetailsEntity orderDet = orderDetailsMapper.map(theOrderDetailsDTO);
		orderDetailsRepository.save(orderDet); 				
		return orderDet;
	}

	@Override
	public void delete(Long orderDetailsId) throws RuntimeException {
		orderDetailsRepository.deleteById(orderDetailsId);
	}
	

}
