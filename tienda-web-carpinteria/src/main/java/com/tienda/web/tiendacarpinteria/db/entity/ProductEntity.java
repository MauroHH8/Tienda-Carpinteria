package com.tienda.web.tiendacarpinteria.db.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = ProductEntity.TABLE_NAME)
public class ProductEntity {
	
	public static final String TABLE_NAME = "products";
	
	//id de producto
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//descripcion del producto
	@Column(nullable = false, unique = true)
	private String description;
	
	//Categoria relacionada al producto
	@ManyToOne
	@JoinColumn(name="category_id", nullable = false)
	private CategoryEntity category;
	
	//precio del producto
	@Column(nullable = false)
	private BigDecimal price;
	
	//cantidad de producto
	@Column(nullable = false)
	private Integer quantity;
	
	//Fecha de creacion del producto
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;
	
	
	public ProductEntity() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public CategoryEntity getCategory() {
		return category;
	}


	public void setCategory(CategoryEntity category) {
		this.category = category;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}