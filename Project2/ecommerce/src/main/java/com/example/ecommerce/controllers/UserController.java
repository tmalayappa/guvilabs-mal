package com.example.ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
  
@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;
        @GetMapping("users/get-msg")
        public ResponseEntity<?> getMessage() {
            return ResponseEntity.ok(userService.getList());
        }
}