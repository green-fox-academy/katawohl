package com.greenfox.reddit2.repositories;

import com.greenfox.reddit2.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findById(long id);

    Post findByTitle(String title);

    List<Post> getAllByOrderByLikeCountDesc();
}
