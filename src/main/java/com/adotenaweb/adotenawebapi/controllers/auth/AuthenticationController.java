package com.adotenaweb.adotenawebapi.controllers.auth;


import com.adotenaweb.adotenawebapi.models.dtos.auth.AuthenticationDTO;
import com.adotenaweb.adotenawebapi.services.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody AuthenticationDTO authDTO) {
        authenticationService.authenticateUser(authDTO);
        return ResponseEntity.ok("Login successful");
    }
}
