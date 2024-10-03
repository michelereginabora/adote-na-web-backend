package com.adotenaweb.adotenawebapi.models.entities.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthRoles {
  ADMIN("ROLE_ADMIN"),
  USER("ROLE_USER");

  private final String roleName;
}
