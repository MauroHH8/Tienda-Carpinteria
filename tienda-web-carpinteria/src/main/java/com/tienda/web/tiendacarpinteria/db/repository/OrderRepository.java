package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;
import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;

public interface OrderRepository extends CrudRepository <OrderEntity, Long> {
	
	List<OrderEntity> findByUser (UserEntity user);
	
	Optional<OrderEntity> findById (Long id);
}
