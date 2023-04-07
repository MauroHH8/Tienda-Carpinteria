package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import com.tienda.web.tiendacarpinteria.model.CategoryListDTO;
import com.tienda.web.tiendacarpinteria.model.EmptyResponseDTO;
import com.tienda.web.tiendacarpinteria.model.JWTResponseDTO;
import com.tienda.web.tiendacarpinteria.model.OrderDTO;
import com.tienda.web.tiendacarpinteria.model.OrderDetailsDTO;
import com.tienda.web.tiendacarpinteria.model.OrderListDTO;
import com.tienda.web.tiendacarpinteria.model.OrderRequestDTO;
import com.tienda.web.tiendacarpinteria.model.ProductDTO;
import com.tienda.web.tiendacarpinteria.model.ProductListDTO;
import com.tienda.web.tiendacarpinteria.model.UserDTO;
import com.tienda.web.tiendacarpinteria.model.UserListDTO;
import com.tienda.web.tiendacarpinteria.model.UserRoleDTO;
import com.tienda.web.tiendacarpinteria.model.UserRoleListDTO;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CategoryDTO.class, name = "CategoryDTO"),
  @JsonSubTypes.Type(value = CategoryListDTO.class, name = "CategoryListDTO"),
  @JsonSubTypes.Type(value = EmptyResponseDTO.class, name = "EmptyResponseDTO"),
  @JsonSubTypes.Type(value = JWTResponseDTO.class, name = "JWTResponseDTO"),
  @JsonSubTypes.Type(value = OrderDTO.class, name = "OrderDTO"),
  @JsonSubTypes.Type(value = OrderListDTO.class, name = "OrderListDTO"),
  @JsonSubTypes.Type(value = OrderRequestDTO.class, name = "OrderRequestDTO"),
  @JsonSubTypes.Type(value = ProductDTO.class, name = "ProductDTO"),
  @JsonSubTypes.Type(value = ProductListDTO.class, name = "ProductListDTO"),
  @JsonSubTypes.Type(value = UserDTO.class, name = "UserDTO"),
  @JsonSubTypes.Type(value = UserListDTO.class, name = "UserListDTO"),
  @JsonSubTypes.Type(value = UserRoleDTO.class, name = "UserRoleDTO"),
  @JsonSubTypes.Type(value = UserRoleListDTO.class, name = "UserRoleListDTO")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public interface DataResponseDTO {
    public String getType();
}
