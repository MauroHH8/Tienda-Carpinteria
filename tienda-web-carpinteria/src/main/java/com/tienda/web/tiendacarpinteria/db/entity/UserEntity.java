package com.tienda.web.tiendacarpinteria.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.Validate;


@Entity
@Table(name = UserEntity.TABLE_NAME)
public class UserEntity {
	
	public static final String TABLE_NAME = "users";

	@Id
	private Integer dni;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	
	//Fecha de nacimiento
	@Column(nullable = true)
	private Date dob;

	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	
	@Column(name = "date_created", nullable = false)
	private Date dateCreated;
	
	@Column(name = "date_deleted", nullable = true)
	private Date dateDeleted;
	
	@Enumerated(EnumType.STRING) 
	@Column(name = "role")
	private UserRoleEnum role;
	


	/**
	 * This is the default empty class constructor required by Hibernate. 
	 */
	public UserEntity() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Validate.notBlank(firstName, "The firstName cannot be null or blank");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		Validate.notBlank(lastName, "The lastName cannot be null or blank");
		this.lastName = lastName;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress (String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validate.notBlank(email, "The email cannot be null or blanck");
		this.email = email.toLowerCase();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Validate.notBlank(password, "The password cannot be null or blank");
		if (password.length() < 6 || password.length() > 12 ) {
			throw new IllegalArgumentException("The password length should be between 6 and 12 chars length");
		}
		this.password = password;
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
	
	public UserRoleEnum getRole() {
		return role;
	}

	public void setRole(UserRoleEnum role) {
		this.role = role;
	}
	
}
