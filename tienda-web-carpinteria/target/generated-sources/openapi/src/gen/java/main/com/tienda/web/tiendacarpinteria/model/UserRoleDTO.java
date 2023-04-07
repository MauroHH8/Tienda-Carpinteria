package com.tienda.web.tiendacarpinteria.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * UserRoleDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-06T17:56:51.845809700-03:00[America/Buenos_Aires]")
public class UserRoleDTO implements DataResponseDTO {

  @JsonProperty("email")
  private String email;

  @JsonProperty("role")
  private String role;

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("dateCreated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateCreated;

  @JsonProperty("dateDeleted")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateDeleted;

  @JsonProperty("type")
  private String type;

  public UserRoleDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * this field represent the user email
   * @return email
  */
  @javax.validation.constraints.Email
  @Schema(name = "email", example = "john@email.com", description = "this field represent the user email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRoleDTO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @NotNull 
  @Schema(name = "role", example = "ROLE_USER", required = true)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserRoleDTO level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @NotNull 
  @Schema(name = "level", example = "1", required = true)
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public UserRoleDTO dateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @NotNull @Valid 
  @Schema(name = "dateCreated", example = "Tue Jan 31 21:00:00 ART 2023", required = true)
  public LocalDate getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }

  public UserRoleDTO dateDeleted(LocalDate dateDeleted) {
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

  public UserRoleDTO type(String type) {
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
    UserRoleDTO userRoleDTO = (UserRoleDTO) o;
    return Objects.equals(this.email, userRoleDTO.email) &&
        Objects.equals(this.role, userRoleDTO.role) &&
        Objects.equals(this.level, userRoleDTO.level) &&
        Objects.equals(this.dateCreated, userRoleDTO.dateCreated) &&
        Objects.equals(this.dateDeleted, userRoleDTO.dateDeleted) &&
        Objects.equals(this.type, userRoleDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, role, level, dateCreated, dateDeleted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleDTO {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

