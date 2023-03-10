package com.tienda.web.tiendacarpinteria.db.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = CategoryEntity.TABLE_NAME)

public class CategoryEntity {
public static final String TABLE_NAME = "categories";
	
	// Id de la categoria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//nombre de la categoria
	@Column(nullable = false, unique = true)
	private String name;
	
	//categoria padre (Puede tener un solo padre)
	@OneToOne
	@JoinColumn(name ="parent_id")
	private CategoryEntity parent;
	
	//categorias hijas (Puede tener varias hijas)
	@OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
	private Set<CategoryEntity> children;
	
	//fecha de creacion de la categoria
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;
	
	//productos relacionados a esta categoria
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private Set<ProductEntity> products;
	

	
	public CategoryEntity() {}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public CategoryEntity getParent() {
		return parent;
	}



	public void setParent(CategoryEntity parent) {
		this.parent = parent;
	}



	public Set<CategoryEntity> getChildren() {
		return children;
	}



	public void setChildren(Set<CategoryEntity> children) {
		this.children = children;
	}



	public Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}



	public Set<ProductEntity> getProducts() {
		return products;
	}



	public void setProducts(Set<ProductEntity> products) {
		this.products = products;
	}

	
	
	
}