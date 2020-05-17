package com.greenfox.aliaser.controllers;

import com.greenfox.aliaser.services.LinkService;
import com.greenfox.aliaser.services.LinkServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private LinkService linkService;

    public MainController(LinkServiceImpl linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String renderMainPage(){
        return "index";
    }
}
