package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    private PostService service;

    @Autowired
    public PostController(PostServiceImpl service) {
        this.service = service;
    }
}
