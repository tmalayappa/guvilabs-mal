package com.example.demosb;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope("prototype") //- this will create a new instance of Vehicle class every time it is requested
public class Vehicle {
    private Long id = 1L;
    private String name = "Car";
    
}
