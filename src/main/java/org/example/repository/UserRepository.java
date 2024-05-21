package org.example.repository;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository {

    private List<User> users;

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

    // Method to get a users in system
    public List<User> getUsers() {
        return users;
    }

    // Method to add a user in system
    public User addBook(User userRequest) {
        if (Objects.isNull(userRequest.getUserId()) || Objects.isNull(userRequest.getName()) || userRequest.getName().isEmpty()) {
            throw new RuntimeException("Invalid data");
        }

        Optional<User> existingUser = users.stream().filter(user -> Objects.equals(user.getUserId(), userRequest.getUserId())).findAny();
        if (existingUser.isPresent()) {
            throw new RuntimeException("User already exist for userId: " + userRequest.getUserId());
        }

        users.add(userRequest);
        return getUserByUserId(userRequest.getUserId());
    }

    // Method to get user by userId
    public User getUserByUserId(Integer userId) {
        return users.stream().filter(user -> Objects.equals(user.getUserId(), userId)).findAny()
                .orElseThrow(() -> new RuntimeException("User not found for userId: " + userId));
    }
}
