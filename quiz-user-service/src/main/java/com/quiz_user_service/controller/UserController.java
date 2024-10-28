package com.quiz_user_service.controller;


import com.quiz_user_service.entity.QuizUser;
import com.quiz_user_service.service.impl.QuizUserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final QuizUserServiceImpl userService;

    public UserController(QuizUserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<QuizUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public QuizUser createUser(@RequestBody QuizUser user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public QuizUser getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
