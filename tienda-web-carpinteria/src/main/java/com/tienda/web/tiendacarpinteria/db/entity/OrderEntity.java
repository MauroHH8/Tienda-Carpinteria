package com.tienda.web.tiendacarpinteria.db.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = OrderEntity.TABLE_NAME)
public class OrderEntity {

	
	public static final String TABLE_NAME = "orders";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private UserEntity user;
	
	@OneToMany(mappedBy="order")
	private List<OrderDetailsEntity> detail;
	
	@Column (name = "price", nullable = false)
	private BigDecimal price;

	@Column(name = "date_created", nullable = false)
	private Date dateCreated;
	
	@Column(name = "date_deleted", nullable = true)
	private Date dateDeleted;
	
	
	
	/**
	 * This is the default empty class constructor required by Hibernate. 
	 */
	public OrderEntity() {}



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



	public List<OrderDetailsEntity> getDetail() {
		return detail;
	}



	public void setDetail(List<OrderDetailsEntity> detail) {
		this.detail = detail;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
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

	
	
}

