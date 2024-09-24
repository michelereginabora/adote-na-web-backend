package com.adotenaweb.adotenawebapi.services.user;

import com.adotenaweb.adotenawebapi.exceptions.user.UserAlreadyExistsException;
import com.adotenaweb.adotenawebapi.models.dtos.user.UserRegistrationDTO;
import com.adotenaweb.adotenawebapi.models.entities.user.User;
import com.adotenaweb.adotenawebapi.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(UserRegistrationDTO registrationDTO) {
        if (userRepository.existsByEmail(registrationDTO.getEmail())) {
            throw new UserAlreadyExistsException("User with this email already exists");
        }
        if (userRepository.existsByPhone(registrationDTO.getPhone())) {
            throw new UserAlreadyExistsException("User with this phone number already exists");
        }

        User user = new User();
        user.setName(registrationDTO.getName());
        user.setEmail(registrationDTO.getEmail());
        user.setPhone(registrationDTO.getPhone());
        user.setPassword(passwordEncoder.encode(registrationDTO.getPassword()));

        return userRepository.save(user);
    }
}