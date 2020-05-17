package com.greenfox.aliaser.controllers;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.services.LinkService;
import com.greenfox.aliaser.services.LinkServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private LinkService linkService;

    public MainController(LinkServiceImpl linkService) {
        this.linkService = linkService;
    }

    //need a walkthrough with this first part of the exam!
    @GetMapping("/")
    public String renderMainPage(@RequestBody(required = false) Link link, Model model) {

        model.addAttribute("found", link != null);

        if (link != null) {
            model.addAttribute("secretCode", link.getSecretCode() != null);
            model.addAttribute("link", link);
        }
        return "index";
    }

    // throwing exception instead of this wacky nonsense (what do exceptions do in such environment?)
    @GetMapping("/a/{alias}")
    public String incrementHItCount(@PathVariable(name = "alias") String alias, Model model) {
        Link link = linkService.findByAlias(alias);
        if (link != null) {
            linkService.incrementLinkHitCount(link);
            return "redirect:/" + link.getUrl();
        } else {
            HttpStatus status = HttpStatus.NOT_FOUND;
            model.addAttribute("status", status);
            return "errorpage";
        }

    }
}
