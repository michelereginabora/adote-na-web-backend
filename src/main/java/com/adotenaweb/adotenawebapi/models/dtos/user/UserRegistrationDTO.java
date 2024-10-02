package com.adotenaweb.adotenawebapi.models.dtos.user;

import com.adotenaweb.adotenawebapi.models.entities.user.UserRole;
import lombok.Data;

@Data
public class UserRegistrationDTO {
    private String name;
    private String email;
    private String phone;
    private String password;
    private UserRole role;
}
