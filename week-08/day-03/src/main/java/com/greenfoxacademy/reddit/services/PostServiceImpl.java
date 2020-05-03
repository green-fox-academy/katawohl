package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public List<Post> getPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);

    return posts;
  }

  @Override
  public Post findById(long id) {
    return null;
  }

  @Override
  public void votePost() {

  }
}
