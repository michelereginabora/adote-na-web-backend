package com.adotenaweb.adotenawebapi.services.auth;

import com.adotenaweb.adotenawebapi.exceptions.auth.InvalidCredentialsException;
import com.adotenaweb.adotenawebapi.models.dtos.auth.AuthenticationDTO;
import com.adotenaweb.adotenawebapi.models.entities.user.User;
import com.adotenaweb.adotenawebapi.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User authenticateUser(AuthenticationDTO authDTO) {
        UserDetails userDetails = userRepository.findByPhone(authDTO.getPhone())
                .orElseThrow(() -> new InvalidCredentialsException("User not found"));

        if (!passwordEncoder.matches(authDTO.getPassword(), userDetails.getPassword())) {
            throw new InvalidCredentialsException("Invalid password");
        }

        return (User) userDetails;
    }
}