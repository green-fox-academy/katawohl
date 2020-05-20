package com.greenfox.reddit2.repositories;

import com.greenfox.reddit2.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
    User findByName(String name);
    List<User> findAll();
}
