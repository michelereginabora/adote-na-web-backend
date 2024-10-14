package com.adotenaweb.adotenawebapi.repositories.user;

import com.adotenaweb.adotenawebapi.models.entities.user.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {
  Optional<UserDetails> findByPhone(String phone);

  boolean existsByPhone(String phone);

  Optional<UserDetails> findByEmail(String email);

  boolean existsByEmail(String email);
}
