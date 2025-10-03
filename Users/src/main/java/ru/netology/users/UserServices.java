package ru.netology.users;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServices {
    HashMap<Integer, User> users = new HashMap<>();

    public UserServices() {
        users.put(1, new User("John", "john@example.com", "Smith", "+1234567890", "123 Main St"));
        users.put(2, new User("Emma", "emma@example.com", "Johnson", "+1234567891", "456 Oak Ave"));
        users.put(3, new User("Michael", "michael@example.com", "Williams", "+1234567892", "789 Pine Rd"));
        users.put(4, new User("Sarah", "sarah@example.com", "Brown", "+1234567893", "321 Elm St"));
        users.put(5, new User("David", "david@example.com", "Jones", "+1234567894", "654 Maple Dr"));
        users.put(6, new User("Lisa", "lisa@example.com", "Miller", "+1234567895", "987 Cedar Ln"));
        users.put(7, new User("Robert", "robert@example.com", "Davis", "+1234567896", "147 Birch Way"));
        users.put(8, new User("Jennifer", "jennifer@example.com", "Garcia", "+1234567897", "258 Spruce Ct"));
        users.put(9, new User("Thomas", "thomas@example.com", "Rodriguez", "+1234567898", "369 Willow Ave"));
        users.put(10, new User("Maria", "maria@example.com", "Wilson", "+1234567899", "741 Aspen St"));
        users.put(11, new User("Daniel", "daniel@example.com", "Martinez", "+1234567800", "852 Poplar Rd"));
        users.put(12, new User("Susan", "susan@example.com", "Anderson", "+1234567801", "963 Magnolia Dr"));
        users.put(13, new User("Charles", "charles@example.com", "Taylor", "+1234567802", "159 Redwood Ln"));
        users.put(14, new User("Karen", "karen@example.com", "Thomas", "+1234567803", "357 Sequoia Way"));
        users.put(15, new User("Paul", "paul@example.com", "Moore", "+1234567804", "486 Cypress Ct"));
    }



    public User getUsers(int id) {
        return users.get(id);
    }
}
