package com.jwt.demojwttrying.model.repos;

import com.jwt.demojwttrying.model.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "roles")
    public User findByEmail(String email);
}
