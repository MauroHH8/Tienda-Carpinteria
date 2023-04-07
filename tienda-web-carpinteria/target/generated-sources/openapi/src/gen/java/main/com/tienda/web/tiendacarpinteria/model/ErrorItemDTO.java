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
 * ErrorItemDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class ErrorItemDTO {

  @JsonProperty("code")
  private String code;

  @JsonProperty("link")
  private String link;

  @JsonProperty("detail")
  private String detail;

  public ErrorItemDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  
  @Schema(name = "code", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorItemDTO link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
  */
  
  @Schema(name = "link", required = false)
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ErrorItemDTO detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  
  @Schema(name = "detail", required = false)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItemDTO errorItemDTO = (ErrorItemDTO) o;
    return Objects.equals(this.code, errorItemDTO.code) &&
        Objects.equals(this.link, errorItemDTO.link) &&
        Objects.equals(this.detail, errorItemDTO.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, link, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItemDTO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

