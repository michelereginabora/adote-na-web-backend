package com.adotenaweb.adotenawebapi.models.dtos.user;

import com.adotenaweb.adotenawebapi.models.entities.user.UserRole;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class UserRegistrationDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10,11}", message = "Phone number must contain 10 or 11 numeric digits")
    private String phone;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    private UserRole role;
}