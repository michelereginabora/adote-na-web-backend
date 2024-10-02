package com.adotenaweb.adotenawebapi.routes;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

public class AuthenticatedRoutes {
    public static void configure(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry authorize) {
        authorize.anyRequest().authenticated();
    }
}