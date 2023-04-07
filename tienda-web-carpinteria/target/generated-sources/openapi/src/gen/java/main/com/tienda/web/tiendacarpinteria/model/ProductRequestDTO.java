package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.CategoryDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class ProductRequestDTO {

  @JsonProperty("description")
  private String description;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("qty")
  private Integer qty;

  @JsonProperty("category")
  private CategoryDTO category;

  public ProductRequestDTO description(String description) {
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

  public ProductRequestDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", example = "35000", required = true)
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductRequestDTO qty(Integer qty) {
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

  public ProductRequestDTO category(CategoryDTO category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull @Valid 
  @Schema(name = "category", required = true)
  public CategoryDTO getCategory() {
    return category;
  }

  public void setCategory(CategoryDTO category) {
    this.category = category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequestDTO productRequestDTO = (ProductRequestDTO) o;
    return Objects.equals(this.description, productRequestDTO.description) &&
        Objects.equals(this.price, productRequestDTO.price) &&
        Objects.equals(this.qty, productRequestDTO.qty) &&
        Objects.equals(this.category, productRequestDTO.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, price, qty, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequestDTO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

