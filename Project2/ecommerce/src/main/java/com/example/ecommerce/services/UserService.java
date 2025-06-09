package com.example.ecommerce.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.models.User;
import com.example.ecommerce.repository.UserRep;

@Service
public class UserService {
    @Autowired
    UserRep userRep;
    public List<User> getList() {
        List<User> users = new ArrayList<>();
        // Simulating a database fetch

        return users;
    }
}
