package com.example.ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;
import com.example.ecommerce.models.User;
  
@RestController
@CrossOrigin("*")
public class UserController {
    
    @GetMapping("users/get-msg")
    public ResponseEntity<?> getMessage() {
        User userOne = new User(1L, "RAJA", "raja@example.com", "9998987", "TRICHY");
        User userTwo = new User(2L, "KUMAR", "kumar@example.com","9998988", "TRICHY");

        List<User> users = new ArrayList<>();
        users.add(userOne);
        users.add(userTwo);

        return ResponseEntity.ok(users);
    }
}