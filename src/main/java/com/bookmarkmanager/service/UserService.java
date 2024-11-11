package com.bookmarkmanager.service;

import com.bookmarkmanager.model.User;

import java.util.List;

public class UserService {

    private static UserService instance = new UserService();

    private UserService() {
    }

    public static UserService getInstance() {
        return instance;
    }

    public User getUserbyId(Long userId) {
        // Find user by id
        return null;
    }


    public List<User> getAllUsers() {
        return null;
    }

    public User save(User user) {
        return null;
    }

    public void delete(User user) {
        // Delete user
    }

    public User createUser(User user) {
        return save(user);
    }

    public User updateUser(User user) {
        return save(user);
    }
}


