package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class UserDTO implements DataResponseDTO {

  @JsonProperty("dni")
  private Integer dni;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("address")
  private String address;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("dateOfBirthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirthday;

  @JsonProperty("dateCreated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateCreated;

  @JsonProperty("dateDeleted")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateDeleted;

  @JsonProperty("type")
  private String type;

  public UserDTO dni(Integer dni) {
    this.dni = dni;
    return this;
  }

  /**
   * Get dni
   * @return dni
  */
  @NotNull 
  @Schema(name = "dni", example = "40000000", required = true)
  public Integer getDni() {
    return dni;
  }

  public void setDni(Integer dni) {
    this.dni = dni;
  }

  public UserDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", example = "Juan", required = true)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", example = "Lopez", required = true)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDTO address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @NotNull 
  @Schema(name = "address", example = "Av. Rivadavia 1000", required = true)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * this field represent the user email
   * @return email
  */
  @NotNull @javax.validation.constraints.Email
  @Schema(name = "email", example = "jlopez@email.com", description = "this field represent the user email", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull @Size(min = 6, max = 16) 
  @Schema(name = "password", example = "p4$sW0rD!", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDTO dateOfBirthday(LocalDate dateOfBirthday) {
    this.dateOfBirthday = dateOfBirthday;
    return this;
  }

  /**
   * Get dateOfBirthday
   * @return dateOfBirthday
  */
  @Valid 
  @Schema(name = "dateOfBirthday", example = "Sat Dec 31 21:00:00 ART 2022", required = false)
  public LocalDate getDateOfBirthday() {
    return dateOfBirthday;
  }

  public void setDateOfBirthday(LocalDate dateOfBirthday) {
    this.dateOfBirthday = dateOfBirthday;
  }

  public UserDTO dateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @NotNull @Valid 
  @Schema(name = "dateCreated", example = "Sat Dec 31 21:00:00 ART 2022", required = true)
  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public UserDTO dateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

  /**
   * Get dateDeleted
   * @return dateDeleted
  */
  @Valid 
  @Schema(name = "dateDeleted", example = "Sat Dec 31 21:00:00 ART 2022", required = false)
  public LocalDate getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
  }

  public UserDTO type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the contained object
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the contained object", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.dni, userDTO.dni) &&
        Objects.equals(this.firstName, userDTO.firstName) &&
        Objects.equals(this.lastName, userDTO.lastName) &&
        Objects.equals(this.address, userDTO.address) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.password, userDTO.password) &&
        Objects.equals(this.dateOfBirthday, userDTO.dateOfBirthday) &&
        Objects.equals(this.dateCreated, userDTO.dateCreated) &&
        Objects.equals(this.dateDeleted, userDTO.dateDeleted) &&
        Objects.equals(this.type, userDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni, firstName, lastName, address, email, password, dateOfBirthday, dateCreated, dateDeleted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    dateOfBirthday: ").append(toIndentedString(dateOfBirthday)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

