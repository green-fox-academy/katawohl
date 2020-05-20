package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/increase-like/{id}")
    public String increaseLikeCount(@PathVariable(name = "id") long id) {
        Post post = service.findById(id);
        post.setLikeCount(post.getLikeCount() + 1);
        service.addPost(post);

        return "redirect:/";
    }

    @GetMapping("/decrease-like/{id}")
    public String decreaseLikeCount(@PathVariable(name = "id") long id) {
        Post post = service.findById(id);
        post.setLikeCount(post.getLikeCount() - 1);
        service.addPost(post);

        return "redirect:/";
    }
}
