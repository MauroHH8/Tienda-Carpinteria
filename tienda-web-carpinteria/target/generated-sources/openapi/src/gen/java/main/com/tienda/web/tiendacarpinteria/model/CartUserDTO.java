package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CartUserDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class CartUserDTO {

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

  public CartUserDTO dni(Integer dni) {
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

  public CartUserDTO firstName(String firstName) {
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

  public CartUserDTO lastName(String lastName) {
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

  public CartUserDTO address(String address) {
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

  public CartUserDTO email(String email) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartUserDTO cartUserDTO = (CartUserDTO) o;
    return Objects.equals(this.dni, cartUserDTO.dni) &&
        Objects.equals(this.firstName, cartUserDTO.firstName) &&
        Objects.equals(this.lastName, cartUserDTO.lastName) &&
        Objects.equals(this.address, cartUserDTO.address) &&
        Objects.equals(this.email, cartUserDTO.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dni, firstName, lastName, address, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartUserDTO {\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

