package com.example.demosb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    // public static final String APP_NAME = "Demo Spring Boot Application";
    // public static final String VERSION = "1.0.0";
    // public static final String BASE_URL = "/api/v1";

    // // Database configuration
    // public static final String DB_URL = "jdbc:mysql://localhost:3306/demo_db";
    // public static final String DB_USER = "root";
    // public static final String DB_PASSWORD = "password";

    // // Logging configuration
    // public static final String LOG_LEVEL = "INFO";

    // // Other configurations can be added here

    @Bean
    public String getMySQLConnection(){
        return "MySQL";
    }

    @Bean
    public String getMongoDBConnection(){
        return "Mongo";
    }
}
