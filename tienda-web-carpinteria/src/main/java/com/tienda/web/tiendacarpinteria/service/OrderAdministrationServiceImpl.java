package com.tienda.web.tiendacarpinteria.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;
import com.tienda.web.tiendacarpinteria.db.repository.OrderRepository;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.service.mapper.OrderMapper;

public class OrderAdministrationServiceImpl implements OrderAdministrationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderAdministrationServiceImpl.class);
	
	
	
	private OrderRepository orderRepository; //Interaccion con el data source (CRUD)
	private OrderMapper orderMapper; //Conversor de objetos
	
	
	
	public OrderAdministrationServiceImpl(OrderRepository theOrderRepository, OrderMapper theOrderMapper) {
		orderRepository = theOrderRepository;
		orderMapper = theOrderMapper;
	}


	@Override
	public List<OrderDTO> retrieveAll() throws RuntimeException {
		LOGGER.trace(String.format("Listing all orders"));
		Iterable<OrderEntity> orders = orderRepository.findAll();
		Iterator<OrderEntity> iter = orders.iterator();
		List<OrderDTO> response = new ArrayList<>();
		while (iter.hasNext()) {
			response.add(orderMapper.map(iter.next()));
		}
		return response;
	}

	
	//Traer order por id
	@Override
	public OrderDTO retrieve(Long orderId) throws RuntimeException {
		Optional<OrderEntity> opOrder = orderRepository.findById(orderId);
		if (opOrder.isEmpty()) {
			throw new RuntimeException(String.format("The order could not be found under id %d", orderId));
		}
		return orderMapper.map(opOrder.get()); //Conversión de OrderEntity a DTO.
	}
	
	//Traer orden por usuario
	@Override
	public List<OrderEntity> retrieveByUser(UserEntity user) {
		
		return orderRepository.findByUser(user);
	}

	//Creacion de la orden
	@Override
	public OrderDTO create(OrderRequestDTO element) throws RuntimeException {
		OrderEntity order = orderMapper.mapReq(element); //OrderRequestDTO a OrderEntity
		orderRepository.save(order);//Envio a la bbdd
		return orderMapper.map(order);				//OrderEntity a OrderDTO
	}

	
	@Override
	public OrderDTO update(OrderDTO element) throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	//Eliminacion de la orden
	@Override
	public void delete(Long orderId) throws RuntimeException {
		orderRepository.deleteById(orderId);
		
	}



	
	
	

}
