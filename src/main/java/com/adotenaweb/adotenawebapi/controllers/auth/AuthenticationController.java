package com.adotenaweb.adotenawebapi.controllers.auth;


import com.adotenaweb.adotenawebapi.models.dtos.auth.AuthResponseDTO;
import com.adotenaweb.adotenawebapi.models.dtos.auth.AuthenticationDTO;
import com.adotenaweb.adotenawebapi.models.entities.user.User;
import com.adotenaweb.adotenawebapi.security.TokenService;
import com.adotenaweb.adotenawebapi.services.auth.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody AuthenticationDTO authDTO) {
        User auth = authenticationService.authenticateUser(authDTO);

        var token = tokenService.generateToken(auth);
        return ResponseEntity.ok(new AuthResponseDTO(token));
    }
}
