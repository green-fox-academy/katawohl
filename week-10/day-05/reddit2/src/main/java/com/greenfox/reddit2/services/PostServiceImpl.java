package com.greenfox.reddit2.services;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository repository;

    @Autowired
    public PostServiceImpl(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Post> listAllPosts() {
        return repository.findAll();
    }

    @Override
    public void addPost(Post post) {
        repository.save(post);
    }

    @Override
    public Post findById(long id) {
        return repository.findById(id);
    }
}
