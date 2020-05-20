package com.greenfox.reddit2.repositories;

import com.greenfox.reddit2.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
}
