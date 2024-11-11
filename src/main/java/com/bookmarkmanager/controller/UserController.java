package com.bookmarkmanager.controller;

import com.bookmarkmanager.model.Folder;
import com.bookmarkmanager.model.User;
import com.bookmarkmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService userService = UserService.getInstance();

    @GetMapping("/{userId}/shared-folders")
    public List<Folder> getSharedFolders(@PathVariable Long userId) {
        return userService.getUserbyId(userId).getSharedFolders();
    }

    @GetMapping("/{userId}/shared-bookmarks")
    public List<Folder> getSharedBookmarks(@PathVariable Long userId) {
        return userService.getUserbyId(userId).getSharedBookmarks();
    }

    @GetMapping("/{userId}/folders")
    public List<Folder> getFolders(@PathVariable Long userId) {
        return userService.getUserbyId(userId).getFolder();
    }

    // get user by id
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUserbyId(userId);
    }

    // get all users
    @GetMapping(value = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // create a new user
    @GetMapping(value = "/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // update a user
    @PutMapping(value = "/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // delete a user
    @DeleteMapping(value = "/delete")
    public void deleteUser(@RequestBody User user) {
        userService.delete(user);
    }

}
