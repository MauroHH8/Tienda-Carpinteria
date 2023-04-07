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
 * MetaInformationResponseDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class MetaInformationResponseDTO {

  @JsonProperty("time")
  private Long time;

  @JsonProperty("refNumber")
  private String refNumber;

  public MetaInformationResponseDTO time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @NotNull 
  @Schema(name = "time", required = true)
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MetaInformationResponseDTO refNumber(String refNumber) {
    this.refNumber = refNumber;
    return this;
  }

  /**
   * Get refNumber
   * @return refNumber
  */
  
  @Schema(name = "refNumber", required = false)
  public String getRefNumber() {
    return refNumber;
  }

  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaInformationResponseDTO metaInformationResponseDTO = (MetaInformationResponseDTO) o;
    return Objects.equals(this.time, metaInformationResponseDTO.time) &&
        Objects.equals(this.refNumber, metaInformationResponseDTO.refNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, refNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaInformationResponseDTO {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
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

