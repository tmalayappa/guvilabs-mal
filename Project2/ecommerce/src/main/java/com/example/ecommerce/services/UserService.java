package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce.models.User;

@Service
public class UserService {
    public List<User> getList() {    
        User userOne = new User(1L, "RAJA", "raja@example.com", "9998987", "TRICHY");
        User userTwo = new User(2L, "KUMAR", "kumar@example.com","9998988", "TRICHY");

        List<User> users = new ArrayList<>();
        users.add(userOne);
        users.add(userTwo);

        return users;
    }
}
