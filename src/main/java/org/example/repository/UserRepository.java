package org.example.repository;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        initializeUsers();
    }

    // Method to initialize sample book data
    private void initializeUsers() {
        users.add(new User(1, "Soham Parsad"));
        users.add(new User(2, "Shiv Tripathi"));
        users.add(new User(3, "Shivam Pathak"));
        users.add(new User(4, "Shivay Singh"));
        users.add(new User(5, "Shambhu Patil"));
        users.add(new User(6, "Shankar Raj"));
    }
}
