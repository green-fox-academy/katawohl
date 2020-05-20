package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User findById(long id);
    User findByName(String name);
    List<User> listAllUsers();
}
