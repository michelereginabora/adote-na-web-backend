package com.adotenaweb.adotenawebapi.models.dtos.auth;

import lombok.Data;

@Data
public class AuthenticationDTO {
    private String phone;
    private String password;
}
