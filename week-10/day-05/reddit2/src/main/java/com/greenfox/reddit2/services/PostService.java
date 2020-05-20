package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.Post;

import java.util.List;

public interface PostService {

    List<Post> listAllPosts();
    void addPost(Post post);
    Post findById(long id);
    Post findByTitle(String title);
    void deletePost(Post post);
}
