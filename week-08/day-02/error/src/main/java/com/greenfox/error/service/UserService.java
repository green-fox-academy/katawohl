package com.greenfox.error.service;

import com.greenfox.error.models.User;

import com.greenfox.error.repositories.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aze on 25/10/17.
 */

@Service
public class UserService {
  private UserRepository repository;

  @Autowired
  public UserService(UserRepository repository){
    this.repository = repository;
  }

  private ArrayList<User> users;

  public UserService() {
    this.users = new ArrayList<>();
  }

  public ArrayList<User> getAll() {
    return users;
  }

  public void save(User user) {
    users.add(user);
  }

  public UserService service() {
    return new UserService();
  }
}