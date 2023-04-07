package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDetailsDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class OrderDetailsDTO {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("user")
  private UserDTO user;

  @JsonProperty("product")
  private ProductDTO product;

  @JsonProperty("order")
  private OrderRequestDTO order;

  @JsonProperty("dateCreated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateCreated;

  public OrderDetailsDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDetailsDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", required = false)
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public OrderDetailsDTO product(ProductDTO product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "product", required = false)
  public ProductDTO getProduct() {
    return product;
  }

  public void setProduct(ProductDTO product) {
    this.product = product;
  }

  public OrderDetailsDTO order(OrderRequestDTO order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @Valid 
  @Schema(name = "order", required = false)
  public OrderRequestDTO getOrder() {
    return order;
  }

  public void setOrder(OrderRequestDTO order) {
    this.order = order;
  }

  public OrderDetailsDTO dateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @Valid 
  @Schema(name = "dateCreated", example = "Tue Jan 31 21:00:00 ART 2023", required = false)
  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailsDTO orderDetailsDTO = (OrderDetailsDTO) o;
    return Objects.equals(this.id, orderDetailsDTO.id) &&
        Objects.equals(this.user, orderDetailsDTO.user) &&
        Objects.equals(this.product, orderDetailsDTO.product) &&
        Objects.equals(this.order, orderDetailsDTO.order) &&
        Objects.equals(this.dateCreated, orderDetailsDTO.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, product, order, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

