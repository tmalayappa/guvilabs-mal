package com.guvi.guvisever;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("")
    public ResponseEntity<?> getMethodName() {
        Map<String, Object> user1 = Map.of("id", 1, "name", "guviUserOne");
        Map<String, Object> user2 = Map.of("id", 2, "name", "guviUserTwo");

        List< Map<String, Object>> users = Arrays.asList(user1, user2);
        return ResponseEntity.ok(users);
    }
}
