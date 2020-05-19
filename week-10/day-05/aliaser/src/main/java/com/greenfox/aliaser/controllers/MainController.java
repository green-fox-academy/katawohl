package com.greenfox.aliaser.controllers;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.services.LinkService;
import com.greenfox.aliaser.services.LinkServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MainController {

    private LinkService linkService;

    public MainController(LinkServiceImpl linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String renderMainPage(@ModelAttribute Link link,
                                 @RequestParam(required = false) Boolean ifAliasExists,
                                 Model model) {
        if (ifAliasExists == null) {
            model.addAttribute("link", new Link());
        } else if (ifAliasExists) {
            model.addAttribute("link", link);
            model.addAttribute("aliasExists", ifAliasExists.booleanValue() == true);
        } else {
            model.addAttribute("link", new Link());
            model.addAttribute("successLink", link);
            model.addAttribute("aliasNotExist", ifAliasExists.booleanValue() == false);
            }

            return "index";
        }

    @PostMapping("/save-link")
    public String saveLink(@ModelAttribute Link link, RedirectAttributes attributes) {
        attributes.addFlashAttribute(link);

        if (linkService.findByAlias(link.getAlias()) != null) {
            return "redirect:/?ifAliasExists=true";
        } else {
            linkService.generateSecretCode(link);
            linkService.addLink(link);
            return "redirect:/?ifAliasExists=false";
        }
    }

    // throwing exception instead of this wacky nonsense (what do exceptions do in such environment?)
    @GetMapping("/a/{alias}")
    public String incrementHitCount(@PathVariable(name = "alias") String alias, Model model) {
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
