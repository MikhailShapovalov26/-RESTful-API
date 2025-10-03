package ru.netology.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserServices userServices = new UserServices();
    @GetMapping("/api/users/{userId}")
    public User getUser(@PathVariable int userId) {
        return userServices.getUsers(userId);

    }
}
