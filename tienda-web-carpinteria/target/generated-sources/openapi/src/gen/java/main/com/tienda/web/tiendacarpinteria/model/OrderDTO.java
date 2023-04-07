package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class OrderDTO implements DataResponseDTO {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("user")
  private UserDTO user;

  @JsonProperty("orderList")
  @Valid
  private List<OrderDetailsDTO> orderList = null;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("dateCreated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateCreated;

  @JsonProperty("dateDeleted")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateDeleted;

  @JsonProperty("type")
  private String type;

  public OrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "10", required = true)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderDTO user(UserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @NotNull @Valid 
  @Schema(name = "user", required = true)
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public OrderDTO orderList(List<OrderDetailsDTO> orderList) {
    this.orderList = orderList;
    return this;
  }

  public OrderDTO addOrderListItem(OrderDetailsDTO orderListItem) {
    if (this.orderList == null) {
      this.orderList = new ArrayList<>();
    }
    this.orderList.add(orderListItem);
    return this;
  }

  /**
   * Get orderList
   * @return orderList
  */
  @Valid 
  @Schema(name = "orderList", required = false)
  public List<OrderDetailsDTO> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<OrderDetailsDTO> orderList) {
    this.orderList = orderList;
  }

  public OrderDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", required = true)
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderDTO dateCreated(LocalDate dateCreated) {
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

  public OrderDTO dateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

  /**
   * Get dateDeleted
   * @return dateDeleted
  */
  @Valid 
  @Schema(name = "dateDeleted", example = "Tue Jan 31 21:00:00 ART 2023", required = false)
  public LocalDate getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
  }

  public OrderDTO type(String type) {
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
    OrderDTO orderDTO = (OrderDTO) o;
    return Objects.equals(this.id, orderDTO.id) &&
        Objects.equals(this.user, orderDTO.user) &&
        Objects.equals(this.orderList, orderDTO.orderList) &&
        Objects.equals(this.price, orderDTO.price) &&
        Objects.equals(this.dateCreated, orderDTO.dateCreated) &&
        Objects.equals(this.dateDeleted, orderDTO.dateDeleted) &&
        Objects.equals(this.type, orderDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, orderList, price, dateCreated, dateDeleted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

