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
 * CategoryRequestDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class CategoryRequestDTO {

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentCategoryId")
  private Long parentCategoryId;

  public CategoryRequestDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Cajas", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryRequestDTO parentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
    return this;
  }

  /**
   * Get parentCategoryId
   * @return parentCategoryId
  */
  
  @Schema(name = "parentCategoryId", example = "1", required = false)
  public Long getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(Long parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRequestDTO categoryRequestDTO = (CategoryRequestDTO) o;
    return Objects.equals(this.name, categoryRequestDTO.name) &&
        Objects.equals(this.parentCategoryId, categoryRequestDTO.parentCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRequestDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
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

