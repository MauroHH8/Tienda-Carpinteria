package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
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
 * ProductDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class ProductDTO implements DataResponseDTO {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("qty")
  private Integer qty;

  @JsonProperty("category")
  private CategoryDTO category;

  @JsonProperty("dateCreated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateCreated;

  @JsonProperty("dateDeleted")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateDeleted;

  @JsonProperty("type")
  private String type;

  public ProductDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "37", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Caja de te de 4 divisiones", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", example = "3500", required = true)
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductDTO qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * the stock quantity.
   * @return qty
  */
  @NotNull 
  @Schema(name = "qty", example = "2", description = "the stock quantity.", required = true)
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public ProductDTO category(CategoryDTO category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", required = false)
  public CategoryDTO getCategory() {
    return category;
  }

  public void setCategory(CategoryDTO category) {
    this.category = category;
  }

  public ProductDTO dateCreated(LocalDate dateCreated) {
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

  public ProductDTO dateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
    return this;
  }

  /**
   * Get dateDeleted
   * @return dateDeleted
  */
  @Valid 
  @Schema(name = "dateDeleted", example = "Sun Jan 01 21:00:00 ART 2023", required = false)
  public LocalDate getDateDeleted() {
    return dateDeleted;
  }

  public void setDateDeleted(LocalDate dateDeleted) {
    this.dateDeleted = dateDeleted;
  }

  public ProductDTO type(String type) {
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
    ProductDTO productDTO = (ProductDTO) o;
    return Objects.equals(this.id, productDTO.id) &&
        Objects.equals(this.description, productDTO.description) &&
        Objects.equals(this.price, productDTO.price) &&
        Objects.equals(this.qty, productDTO.qty) &&
        Objects.equals(this.category, productDTO.category) &&
        Objects.equals(this.dateCreated, productDTO.dateCreated) &&
        Objects.equals(this.dateDeleted, productDTO.dateDeleted) &&
        Objects.equals(this.type, productDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, price, qty, category, dateCreated, dateDeleted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

