package com.example.demo_jwt.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo_jwt.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
// Update the import below to match the actual package of your Users class
import com.example.demo_jwt.models.Users;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users registerUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Users authenticateUser(String username, String password) {
        Users user = userRepository.findByUsername(username); // Ensure UserRepository returns Users type
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        } else {
            return null;
        }
    }
}