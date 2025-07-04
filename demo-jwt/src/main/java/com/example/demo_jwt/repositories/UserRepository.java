package com.example.demo_jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo_jwt.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
    Users findByEmail(String email);
    Users findByPhone(String phone);
}
// This interface extends JpaRepository, which provides CRUD operations for the Users entity.
// It includes methods to find a user by username, email, or phone number.  
// The UserRepository interface is used by the UserService and AuthService to interact with the database.
// It allows for easy retrieval and manipulation of user data without needing to write boilerplate code for database operations.
