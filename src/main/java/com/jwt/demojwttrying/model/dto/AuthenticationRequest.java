package com.jwt.demojwttrying.model.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String login;
    private String password;
}
