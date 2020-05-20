package com.greenfox.reddit2.repositories;

import com.greenfox.reddit2.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
