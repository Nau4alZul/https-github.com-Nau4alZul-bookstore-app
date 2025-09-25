package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public User register(@RequestParam String username, @RequestParam String password) {
        User user = new User(username, password);
        return userRepository.save(user);
    }

    @GetMapping("/login")
    public Map<String, String> login(@RequestParam String username, @RequestParam String password) {
        return userRepository.findByUsernameAndPassword(username, password)
                .map(u -> Map.of("message", "Login successful"))
                .orElse(Map.of("message", "Invalid credentials"));
    }
}
