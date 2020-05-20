package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService service;

    @Autowired
    public PostController(PostServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderMainPage(Model model) {
        model.addAttribute("posts", service.listAllPosts());
        return "index";
    }

    @GetMapping("/submit")
    public String renderSubmitPage() {
        return "submit-page";
    }

    @PostMapping("/submit")
    public String submitPost(@ModelAttribute Post post) {
        service.addPost(post);

        return "redirect:/";
    }
}
