package com.greenfox.aliaser.controllers;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.services.LinkService;
import com.greenfox.aliaser.services.LinkServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private LinkService linkService;

    public APIController(LinkServiceImpl linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/api/links")
    public ResponseEntity<?> submitLink(@ModelAttribute Link link){
        if(linkService.findByAlias(link.getAlias()) != null){
            return ResponseEntity.badRequest().build();
        } else {
            linkService.generateSecretCode(link);
            return ResponseEntity.ok().body(link);
        }
    }
}
