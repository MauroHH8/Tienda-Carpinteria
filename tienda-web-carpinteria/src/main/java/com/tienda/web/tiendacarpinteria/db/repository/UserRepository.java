package com.tienda.web.tiendacarpinteria.db.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tienda.web.tiendacarpinteria.db.entity.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Integer> { 
	
	Optional<UserEntity> findByDni(Integer dni);
	Optional<UserEntity> findOneByEmail(String email);


	UserEntity findOneByDni(Integer dni);
	UserEntity findByEmail(String email);
	
}
