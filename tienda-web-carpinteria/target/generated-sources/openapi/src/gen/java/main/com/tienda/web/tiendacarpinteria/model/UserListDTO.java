package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * UserListDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class UserListDTO implements DataResponseDTO {

  @JsonProperty("items")
  @Valid
  private List<UserDTO> items = null;

  @JsonProperty("type")
  private String type;

  public UserListDTO items(List<UserDTO> items) {
    this.items = items;
    return this;
  }

  public UserListDTO addItemsItem(UserDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public List<UserDTO> getItems() {
    return items;
  }

  public void setItems(List<UserDTO> items) {
    this.items = items;
  }

  public UserListDTO type(String type) {
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
    UserListDTO userListDTO = (UserListDTO) o;
    return Objects.equals(this.items, userListDTO.items) &&
        Objects.equals(this.type, userListDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserListDTO {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

