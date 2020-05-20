package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;
    private PostService postService;

    @Autowired
    public UserController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }
}
