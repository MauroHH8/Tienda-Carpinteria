package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tienda.web.tiendacarpinteria.model.DataResponseDTO;
import com.tienda.web.tiendacarpinteria.model.ErrorItemDTO;
import com.tienda.web.tiendacarpinteria.model.MetaInformationResponseDTO;
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
 * ResponseContainerResponseDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class ResponseContainerResponseDTO {

  @JsonProperty("errors")
  @Valid
  private List<ErrorItemDTO> errors = null;

  @JsonProperty("meta")
  private MetaInformationResponseDTO meta;

  @JsonProperty("data")
  private DataResponseDTO data;

  public ResponseContainerResponseDTO errors(List<ErrorItemDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ResponseContainerResponseDTO addErrorsItem(ErrorItemDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", required = false)
  public List<ErrorItemDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorItemDTO> errors) {
    this.errors = errors;
  }

  public ResponseContainerResponseDTO meta(MetaInformationResponseDTO meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @NotNull @Valid 
  @Schema(name = "meta", required = true)
  public MetaInformationResponseDTO getMeta() {
    return meta;
  }

  public void setMeta(MetaInformationResponseDTO meta) {
    this.meta = meta;
  }

  public ResponseContainerResponseDTO data(DataResponseDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", required = false)
  public DataResponseDTO getData() {
    return data;
  }

  public void setData(DataResponseDTO data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseContainerResponseDTO responseContainerResponseDTO = (ResponseContainerResponseDTO) o;
    return Objects.equals(this.errors, responseContainerResponseDTO.errors) &&
        Objects.equals(this.meta, responseContainerResponseDTO.meta) &&
        Objects.equals(this.data, responseContainerResponseDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContainerResponseDTO {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

