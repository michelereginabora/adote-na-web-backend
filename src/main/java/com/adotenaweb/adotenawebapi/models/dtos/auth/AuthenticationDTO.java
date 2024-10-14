package com.adotenaweb.adotenawebapi.models.dtos.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthenticationDTO {

  @NotBlank(message = "Phone number is required")
  @Pattern(regexp = "\\d{10,11}", message = "Phone number must contain 10 or 11 numeric digits")
  private String phone;

  @NotBlank(message = "Password is required")
  @Size(min = 6, message = "Password must be at least 6 characters long")
  private String password;
}
