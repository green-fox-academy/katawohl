package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    return postRepository.getAllByOrderByLikesDesc();
  }

  @Override
  public Post findById(long id) {
    Optional<Post> optionalPost = postRepository.findById(id);
    Post post = optionalPost.orElse(null);
    return post;
  }

  @Override
  public void votePost(long id, boolean ifLiked) {
    Post post = this.findById(id);
    int likes = post.getLikes();

    if (ifLiked){
      likes++;
    } else {
      likes--;
    }
    post.setLikes(likes);

    this.addPost(post);
  }
}
