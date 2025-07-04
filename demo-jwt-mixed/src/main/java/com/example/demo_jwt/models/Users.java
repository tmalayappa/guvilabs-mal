package com.example.demo_jwt.models;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = {
    @UniqueConstraint(columnNames = "email"),
    @UniqueConstraint(columnNames = "username"),
    @UniqueConstraint(columnNames = "phone")
})
@getter
@Setter

public class Users {
    @Inherited
    @Generated(value = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;
    private String role;
    private String status;
}
// The Users class represents a user entity in the application.
// It is annotated with @Entity to indicate that it is a JPA entity.
// The @Table annotation specifies the table name and unique constraints for the entity.
// The class contains fields for user attributes such as name, email, phone, username, password, role, and status.
// The @Getter and @Setter annotations from Lombok are used to automatically generate getter and setter methods for these fields.
// The Id field is annotated with @GeneratedValue to indicate that it is an auto-generated primary key.