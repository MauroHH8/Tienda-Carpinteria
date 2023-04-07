package com.tienda.web.tiendacarpinteriaui.model;

public class CartUserModel extends BaseHttpRequestModel {
	
	private Long idProduct;
	private Integer cantidad;
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
