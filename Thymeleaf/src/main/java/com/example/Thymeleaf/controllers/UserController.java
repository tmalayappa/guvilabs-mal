package com.example.Thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; // Import Optional for findFirst()
import java.util.concurrent.atomic.AtomicLong; // For generating unique IDs
import java.util.stream.Collectors; // <--- This is essential for the fix

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes; // For flash attributes

import lombok.Data;

@Data
class User {
    private Long id;
    private String name;
    private String email;

    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

@Controller
public class UserController {
    // This list holds our in-memory "database" of users
    // Make it static to ensure it's shared across all requests
    private static List<User> users = new ArrayList<>();

    // For generating unique IDs for new users
    // <--- UNCOMMENTED THIS LINE AND WILL USE IT BELOW
    private static AtomicLong nextId = new AtomicLong(5L);

    // Static initializer block to populate dummy data ONCE when the class is loaded
    // <--- MOVED INITIALIZATION HERE
    static {
        users.add(new User(1L, "John Doe", "john.doe@example.com")); // Corrected email for consistency
        users.add(new User(2L, "Jimmy Doe", "jimmy.doe@example.com")); // Corrected email
        users.add(new User(3L, "Jane Smith", "jane.smith@example.com")); // Corrected email
        users.add(new User(4L, "Alice Johnson", "alice.johnson@example.com")); // Corrected email
    }

    // No-arg constructor - Spring will use this. The dummy data is now in the static block.
    public UserController() {
        // This constructor can be empty. Do NOT initialize 'users' here for a static list.
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", users);
        return "users"; // Renders 'users.html'
    }

    // --- Create User ---
    @GetMapping("/users/create") // Renamed path for clarity and consistency
    public String showUserCreateForm(Model model) {
        model.addAttribute("user", new User()); // Provide a new User object for the form
        return "usercreateform"; // Renders 'usercreateform.html'
    }

    @PostMapping("/users/save") // Renamed path for clarity and consistency
    public String saveUser(@ModelAttribute User user, RedirectAttributes redirectAttributes){
        // <--- ADDED ID ASSIGNMENT FOR NEW USERS
        if (user.getId() == null || user.getId() == 0) { // Check if it's a new user (ID not set or 0)
            user.setId(nextId.getAndIncrement()); // Assign a new unique ID
            users.add(user);
            redirectAttributes.addFlashAttribute("message", "User created successfully!");
        } else {
            // If an ID is present, it implies an update, but this endpoint is for saving new.
            // This case might mean an accidental POST to /save with an existing user.
            redirectAttributes.addFlashAttribute("errorMessage", "Attempted to save an existing user via create endpoint. Use the update functionality.");
        }
        return "redirect:/users";
    }

    // --- Update User ---
    @GetMapping("/users/update") // Renamed path for clarity and consistency
    public String showUserUpdateForm(Model model, @RequestParam Long id) {
        Optional<User> userOptional = users.stream()
                                          .filter(u->u.getId().equals(id))
                                          .findFirst();
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
            return "userupdateform";
        } else {
            // Handle case where user is not found, e.g., redirect with error message
            // You might want to use RedirectAttributes here as well.
            return "redirect:/users";
        }
    }

    @PostMapping("/users/update") // Renamed path for clarity and consistency
    public String updateUser(Model model, @ModelAttribute User user, RedirectAttributes redirectAttributes) {
        // <--- FIXED: Collect to a new mutable ArrayList
        UserController.users = users.stream().map(u->{
            if(u.getId().equals(user.getId())) {
                // When mapping, you can directly return the 'user' object from the form,
                // as it already contains the updated name and email.
                return user; // Return the updated user object
            }
            return u;
        })
        .collect(Collectors.toCollection(ArrayList::new)); // <--- THIS IS THE KEY FIX

        redirectAttributes.addFlashAttribute("message", "User updated successfully!");
        return "redirect:/users";
    }

    // --- Delete User ---
    @GetMapping("/users/delete") // Path is fine
    public String deleteUser(Model model, @RequestParam Long id, RedirectAttributes redirectAttributes) { // Renamed param to 'id' for consistency
        // <--- FIXED: Collect to a new mutable ArrayList
        UserController.users = users.stream()
                                    .filter(u-> !u.getId().equals(id)) // Use 'id' from @RequestParam
                                    .collect(Collectors.toCollection(ArrayList::new)); // <--- THIS IS THE KEY FIX

        redirectAttributes.addFlashAttribute("message", "User deleted successfully!");
        return "redirect:/users";
    }

    @GetMapping("/users/{id}") // New endpoint using a path variable
    public String showUserDetail(@PathVariable Long id, Model model) {
        Optional<User> userOptional = users.stream()
                                          .filter(user -> user.getId().equals(id))
                                          .findFirst();
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
            return "userdetail"; // Return a new template named userdetail.html
        } else {
            // Handle user not found (e.g., redirect to user list with an error message)
            // For simplicity, we'll just redirect to the list here.
            // In a real app, you might show a dedicated error page or use RedirectAttributes.
            return "redirect:/users";
        }
    }
}