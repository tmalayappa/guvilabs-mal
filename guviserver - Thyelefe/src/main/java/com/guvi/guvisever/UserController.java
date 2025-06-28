package com.guvi.guvisever;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    @GetMapping("/users")
    public String getMethodName(Model model) {
        Map<String, Object> user1 = Map.of("id", 1, "name", "guviUserOne");
        Map<String, Object> user2 = Map.of("id", 2, "name", "guviUserTwo");
        List< Map<String, Object>> users = Arrays.asList(user1, user2);
        
        model.addAttribute("message", "Hello thymelefe");
        model.addAttribute("users", users);
   
        return "user"; // user.html (this html is using thymelefe)
    }
}
