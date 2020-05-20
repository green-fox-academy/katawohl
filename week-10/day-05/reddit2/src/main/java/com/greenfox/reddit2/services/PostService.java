package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.models.User;

import java.util.List;

public interface PostService {

    List<Post> listAllPosts();
    void addPost(Post post);
    Post findById(long id);
    Post findByTitle(String title);
    void addUserToPost(User user, Post post);
}
