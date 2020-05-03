package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;

public interface UserService {
  void addUser(User user);
  User findUserById(long id);
}
