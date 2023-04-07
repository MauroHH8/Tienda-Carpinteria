package com.tienda.web.tiendacarpinteriaui.model;

import java.time.LocalDate;

import com.tienda.web.tienda_carpinteria_ui.model.CategoryDTO;
import com.tienda.web.tiendacarpinteriaui.controller.BaseController;

public class ProductCartModel extends BaseController {

	  private String description;
	  private Double price;
	  private Integer qty;
	  private Double total;
	  private Long id;
	  

	public ProductCartModel() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	  

	  
}
