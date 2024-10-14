package com.adotenaweb.adotenawebapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
  private int status;
  private String message;
}
