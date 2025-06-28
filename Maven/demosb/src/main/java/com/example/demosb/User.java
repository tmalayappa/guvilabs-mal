package com.example.demosb;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component //- will create a bean of this class
public class User {
    private Long id;
    private String name;
    private int age;
    
}
