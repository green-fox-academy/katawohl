package com.greenfox.reddit2.controllers;

import com.greenfox.reddit2.models.Post;
import com.greenfox.reddit2.models.User;
import com.greenfox.reddit2.services.PostService;
import com.greenfox.reddit2.services.PostServiceImpl;
import com.greenfox.reddit2.services.UserService;
import com.greenfox.reddit2.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostServiceImpl postService, UserServiceImpl userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/list-of-posts")
    public String renderMainPage(Model model,
                                 @RequestParam(required = false) boolean ifPostNotExist,
                                 @RequestParam(required = false) Long id) {
        model.addAttribute("posts", postService.listAllPosts());
        model.addAttribute("noPost", ifPostNotExist);
        model.addAttribute("id", id);
        return "index";
    }

    @GetMapping("/{userId}/submit")
    public String renderSubmitPage(@PathVariable(name = "userId") Long userId,
                                   @RequestParam(required = false) boolean ifPostAlreadyExists,
                                   @ModelAttribute Post post,
                                   Model model) {

        User user = userService.findById(userId);

        model.addAttribute("user", user);
        model.addAttribute("postExists", ifPostAlreadyExists);
        model.addAttribute("post", ifPostAlreadyExists ? post : new Post());
        return "submit-page";
    }

    @PostMapping("/{userId}/submit")
    public String submitPost(@PathVariable(name = "userId") long userId,
                             @ModelAttribute Post post,
                             RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute(post);

        User user = userService.findById(userId);

        if (postService.findByTitle(post.getTitle()) != null) {
            return "redirect:/submit/?ifPostAlreadyExists=true";
        } else {
            postService.addPost(post);
            postService.addUserToPost(user, post);
            return "redirect:/list-of-posts";
        }

    }

    @GetMapping("/increase-like/{id}")
    public String increaseLikeCount(@PathVariable(name = "id") long id, RedirectAttributes redirectAttributes) {
        Post post = postService.findById(id);

        if (post != null) {
            post.setLikeCount(post.getLikeCount() + 1);
            postService.addPost(post);

            return "redirect:/list-of-posts";
        } else {
            redirectAttributes.addAttribute("id", id);
            return "redirect:/?ifPostNotExist=true";
        }
    }

    @GetMapping("/decrease-like/{id}")
    public String decreaseLikeCount(@PathVariable(name = "id") long id, RedirectAttributes redirectAttributes) {
        Post post = postService.findById(id);

        if (post != null) {
            post.setLikeCount(post.getLikeCount() - 1);
            postService.addPost(post);

            return "redirect:/list-of-posts";
        } else {
            redirectAttributes.addAttribute("id", id);
            return "redirect:/?ifPostNotExist=true";
        }
    }
}
