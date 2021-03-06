package com.greenfox.aliaser.controllers;

import com.greenfox.aliaser.dtos.SecretCodeDTO;
import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.services.LinkService;
import com.greenfox.aliaser.services.LinkServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {

    private LinkService linkService;

    public APIController(LinkServiceImpl linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/api/links")
    public List<Link> displayAllLinks() {
        return linkService.listAllLinks();
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity<?> deleteLink(@RequestBody SecretCodeDTO secretCodeDTO, @PathVariable long id) {
        Link link = linkService.findById(id);

        if (link == null) {
            return ResponseEntity.notFound().build();
        } else if (linkService.findBySecretCode(secretCodeDTO.getSecretCode()) != link) {
            return ResponseEntity.badRequest().build();
        } else {
            linkService.deleteLink(link);
            return ResponseEntity.noContent().build();
        }
    }
}
