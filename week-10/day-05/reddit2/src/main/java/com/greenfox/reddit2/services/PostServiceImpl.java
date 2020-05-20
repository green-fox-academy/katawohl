package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.models.User;
import com.greenfox.reddit2.repositories.PostRepository;
import com.greenfox.reddit2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Post> listAllPosts() {
        return postRepository.getAllByOrderByLikeCountDesc();
    }

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public Post findById(long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post findByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    @Override
    public void addUserToPost(User user, Post post) {
        post.setUser(user);
        List<Post> postList = user.getPostList();
        postList.add(post);
        user.setPostList(postList);
        postRepository.save(post);
        userRepository.save(user);
    }
}
