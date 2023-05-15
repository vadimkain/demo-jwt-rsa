package com.jwt.demojwttrying.model.service;


import com.jwt.demojwttrying.model.entity.User;
import com.jwt.demojwttrying.model.repos.UserRepository;
import com.jwt.demojwttrying.security.JwtUserDetails;
import com.jwt.demojwttrying.security.JwtUserDetailsFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class JwtUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public JwtUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userRepository.findByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }

        JwtUserDetails jwtUserDetails = JwtUserDetailsFactory.create(user);
        log.info("IN loadUserByUsername - user with username: {} successfully loaded", username);

        return jwtUserDetails;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
