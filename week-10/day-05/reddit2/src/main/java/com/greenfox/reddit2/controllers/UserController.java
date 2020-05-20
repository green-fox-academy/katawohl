package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.models.User;
import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;
    private PostService postService;

    @Autowired
    public UserController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping("/")
    public String renderSubmitUser() {
        return "submit-user";
    }

    @PostMapping("/")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/" + user.getId() + "/submit";
    }
}
