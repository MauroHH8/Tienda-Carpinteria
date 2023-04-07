package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.OrderDetailsEntity;
import com.tienda.web.tiendacarpinteria.db.entity.OrderEntity;

public interface OrderDetailsRepository 
 extends CrudRepository<OrderDetailsEntity, Long> {
	
	Optional<OrderDetailsEntity> findById (Long id);

}
