package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Integer> { 
	
	List<UserEntity> findByDni(Integer dni);
	
	List<UserEntity> findAll();
	
}
