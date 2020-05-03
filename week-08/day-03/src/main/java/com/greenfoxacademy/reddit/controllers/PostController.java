package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  private final PostServiceImpl postService;

  @Autowired
  public PostController(PostServiceImpl postService){
    this.postService = postService;
  }

  @GetMapping("")
  public String showPosts(Model model){
    model.addAttribute("posts", postService.getPosts());
    return "posts";
  }

  @GetMapping("/add")
  public String showSubmitPage(Model model){
    model.addAttribute("newPost", new Post());
    return "addpost";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute Post post){
    postService.addPost(post);
    return "redirect:/";
  }
}
