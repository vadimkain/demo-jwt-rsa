package com.jwt.demojwttrying.rest;

import com.jwt.demojwttrying.model.entity.User;
import com.jwt.demojwttrying.model.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class InfoController {
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    public InfoController(JwtUserDetailsService jwtUserDetailsService) {
        this.jwtUserDetailsService = jwtUserDetailsService;
    }

    @GetMapping
    public List<User> info() {
        return jwtUserDetailsService.findAllUsers();
    }
}
