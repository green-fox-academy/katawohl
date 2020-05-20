package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.User;

public interface UserService {
    void addUser(User user);
    User findById(long id);
}
