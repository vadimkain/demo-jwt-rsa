package com.jwt.demojwttrying.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequestMapping("")
public class HomeController {
    @GetMapping
    public String home(Principal principal) {
        var result = "";
        if (principal != null) {
            result = "Hello, " + principal.getName();
        } else {
            result = "Hello, my friend!";
        }
        log.info(result);
        return result;
    }
}
