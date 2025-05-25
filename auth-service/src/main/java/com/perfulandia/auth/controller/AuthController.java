package com.perfulandia.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @GetMapping("/auth")
    public String auth() {
        return "Auth endpoint";
    }

}
    /*@getMapping("/auth/login")
    public String login() {
        return "Login endpoint";
    }

    @getMapping("/auth/forgot-password")
    public String forgotPassword() {
        return "Forgot Password endpoint";
    }

    
    @getMapping("/auth/reset-password")
    public String resetPassword() {
        return "Reset Password endpoint";
    }

    
    @getMapping("/auth/logout")
    public String logout() {
        return "Logout endpoint";
    }*/



