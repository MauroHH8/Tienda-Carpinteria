package com.tienda.web.tiendacarpinteria.service;

import java.util.List;


public interface CrudAdministrationService<T, R, I>{  
	
	List<T> retrieveAll() throws RuntimeException;

	T retrieve(final I element) throws RuntimeException;
	
	T create(final R element) throws RuntimeException;
	
	T update(final T element) throws RuntimeException;
	
	void delete(final I element) throws RuntimeException;
	

}
