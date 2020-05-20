package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    private PostService service;

    @Autowired
    public PostController(PostServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderMainPage(Model model,
                                 @RequestParam(required = false) boolean ifPostNotExist,
                                 @RequestParam(required = false) long id) {
        model.addAttribute("posts", service.listAllPosts());
        model.addAttribute("noPost", ifPostNotExist);
        model.addAttribute("id", id);
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
    public String increaseLikeCount(@PathVariable(name = "id") long id, RedirectAttributes redirectAttributes) {
        Post post = service.findById(id);

        if (post != null) {
            post.setLikeCount(post.getLikeCount() + 1);
            service.addPost(post);

            return "redirect:/";
        } else {
            redirectAttributes.addAttribute("id", id);
            return "redirect:/?ifPostNotExist=true";
        }
    }

    @GetMapping("/decrease-like/{id}")
    public String decreaseLikeCount(@PathVariable(name = "id") long id, RedirectAttributes redirectAttributes) {
        Post post = service.findById(id);

        if (post != null) {
            post.setLikeCount(post.getLikeCount() - 1);
            service.addPost(post);

            return "redirect:/";
        } else {
            redirectAttributes.addAttribute("id", id);
            return "redirect:/?ifPostNotExist=true";
        }
    }
}
