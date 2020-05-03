package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;
  private UserRepository userRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
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

  @Override
  public void addUserToPost(User user, Post post) {
    post.setUser(user);
    List<Post> userPosts = user.getPostList();
    userPosts.add(post);
    user.setPostList(userPosts);
    userRepository.save(user);
    postRepository.save(post);
  }
}
