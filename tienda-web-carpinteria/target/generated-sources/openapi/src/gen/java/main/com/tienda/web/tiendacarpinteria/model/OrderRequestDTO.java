package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class OrderRequestDTO implements DataResponseDTO {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("user")
  private UserDTO user;

  @JsonProperty("orderDetails")
  @Valid
  private List<OrderDetailsDTO> orderDetails = null;

  @JsonProperty("type")
  private String type;

  public OrderRequestDTO id(Long id) {
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

  public OrderRequestDTO user(UserDTO user) {
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

  public OrderRequestDTO orderDetails(List<OrderDetailsDTO> orderDetails) {
    this.orderDetails = orderDetails;
    return this;
  }

  public OrderRequestDTO addOrderDetailsItem(OrderDetailsDTO orderDetailsItem) {
    if (this.orderDetails == null) {
      this.orderDetails = new ArrayList<>();
    }
    this.orderDetails.add(orderDetailsItem);
    return this;
  }

  /**
   * Get orderDetails
   * @return orderDetails
  */
  @Valid 
  @Schema(name = "orderDetails", required = false)
  public List<OrderDetailsDTO> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(List<OrderDetailsDTO> orderDetails) {
    this.orderDetails = orderDetails;
  }

  public OrderRequestDTO type(String type) {
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
    OrderRequestDTO orderRequestDTO = (OrderRequestDTO) o;
    return Objects.equals(this.id, orderRequestDTO.id) &&
        Objects.equals(this.user, orderRequestDTO.user) &&
        Objects.equals(this.orderDetails, orderRequestDTO.orderDetails) &&
        Objects.equals(this.type, orderRequestDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, orderDetails, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequestDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
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

