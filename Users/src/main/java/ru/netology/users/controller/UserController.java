package ru.netology.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.users.model.User;
import ru.netology.users.service.UserServices;

@RestController
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("/api/users/{userId}")
    public User getUser(@PathVariable int userId) {
        return userServices.getUsers(userId);

    }
}
