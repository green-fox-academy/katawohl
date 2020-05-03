package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import com.greenfoxacademy.reddit.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  private final PostServiceImpl postService;
  private final UserServiceImpl userService;

  @Autowired
  public PostController(PostServiceImpl postService, UserServiceImpl userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping( {"", "/enter"})
  public String enterUser(Model model) {
    model.addAttribute("user", new User());
    return "enteruser";
  }

  @PostMapping("/enter")
  public String addUser(@ModelAttribute User user) {
    userService.addUser(user);
    return "redirect:/add/" + user.getId();
  }

  @GetMapping("/add/{userId}")
  public String showSubmitPage(Model model, @PathVariable(name = "userId") long userId) {
    model.addAttribute("user", userService.findUserById(userId));
    model.addAttribute("newPost", new Post());
    return "addpost";
  }

  @PostMapping("/add/{userId}")
  public String addPost(@ModelAttribute Post post, @PathVariable(name = "userId") long userId, Model model) {
    postService.addPost(post);
    postService.addUserToPost(userService.findUserById(userId), post);
    model.addAttribute("user", userService.findUserById(userId));
    return "landpage";
  }

  @GetMapping("/{id}/{ifLiked}")
  public String likePost(@PathVariable(name = "id") long id,
                         @PathVariable(name = "ifLiked") boolean ifLiked) {
    postService.votePost(id, ifLiked);
    return "redirect:/posts/";
  }

  @GetMapping("/posts/")
  public String showPosts(Model model) {
    model.addAttribute("posts", postService.getPosts());
    return "posts";
  }
}
