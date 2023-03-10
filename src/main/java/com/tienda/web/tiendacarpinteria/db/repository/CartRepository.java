package com.tienda.web.tiendacarpinteria.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.CartEntity;

public interface CartRepository extends CrudRepository<CartEntity, Long> {
}

