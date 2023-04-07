package com.tienda.web.tiendacarpinteriaui.model;

import java.util.List;

import com.tienda.web.tienda_carpinteria_ui.model.OrderDetailsDTO;
import com.tienda.web.tienda_carpinteria_ui.model.UserDTO;

public class OrderModel {

	  private Long id;
	  private UserDTO user;
	  private List<OrderDetailsDTO> orderDetails = null;
	  
	public OrderModel() {	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public List<OrderDetailsDTO> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsDTO> orderDetails) {
		this.orderDetails = orderDetails;
	}
	  
	  

}
