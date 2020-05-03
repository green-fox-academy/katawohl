package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;

public interface PostService {
  void addPost(Post post);
  List<Post> getPosts();
  Post findById(long id);
  void votePost();
}
