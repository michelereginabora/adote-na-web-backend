package com.adotenaweb.adotenawebapi.routes;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

public class PublicRoutes {
  public static void configure(
      AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry
          authorize) {
    authorize
        .requestMatchers(HttpMethod.POST, "/auth/login")
        .permitAll()
        .requestMatchers(HttpMethod.POST, "/users/register")
        .permitAll();
  }
}
