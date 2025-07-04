package com.example.demo_jwt.controllers;

import com.example.demo_jwt.models.AuthRequest;
import com.example.demo_jwt.models.AuthResponse;
import com.example.demo_jwt.services.JwtService;

public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public AuthResponse authenticate(AuthRequest request) {
        // Validate the request and generate a JWT token
        String token = jwtService.generateToken(request.getUsername());
        return new AuthResponse(token);
    }
}   




