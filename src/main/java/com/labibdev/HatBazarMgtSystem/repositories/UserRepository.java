package com.labibdev.HatBazarMgtSystem.repositories;


import com.labibdev.HatBazarMgtSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
