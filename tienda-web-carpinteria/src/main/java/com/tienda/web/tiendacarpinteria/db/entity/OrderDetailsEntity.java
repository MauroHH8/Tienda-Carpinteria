package com.tienda.web.tiendacarpinteria.db.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = OrderDetailsEntity.TABLE_NAME)
public class OrderDetailsEntity {

	
	public static final String TABLE_NAME = "order_details";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user")
	private UserEntity user;

	@ManyToOne
	private OrderEntity order;
	
	@ManyToOne
	private ProductEntity product;
	
	@Column (name = "price", nullable = false)
	private BigDecimal price;
	
	@Column (name = "quantity", nullable = false)
	private BigDecimal qty;
	

	@Column(name = "date_created")
	private Date dateCreated;
	
	@Column(name = "date_deleted")
	private Date dateDeleted;
	
	

	public OrderDetailsEntity() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}


	public OrderEntity getOrder() {
		return order;
	}


	public void setOrder(OrderEntity order) {
		this.order = order;
	}


	public ProductEntity getProduct() {
		return product;
	}


	public void setProduct(ProductEntity product) {
		this.product = product;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public Date getDateDeleted() {
		return dateDeleted;
	}


	public void setDateDeleted(Date dateDeleted) {
		this.dateDeleted = dateDeleted;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public BigDecimal getQty() {
		return qty;
	}


	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	
	

	
	
}
