package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinkServiceImpl implements LinkService {

    private LinkRepository linkRepository;

    @Autowired
    public LinkServiceImpl(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public void addLink(Link link) {
        linkRepository.save(link);
    }

    @Override
    public void generateSecretCode(Link link) {
        String secretCode = "";
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            secretCode += random.nextInt(10);
        }

        link.setSecretCode(secretCode);
        linkRepository.save(link);
    }

    @Override
    public Link findByAlias(String alias) {
        Link link = linkRepository.findByAlias(alias).orElse(null);

        return link;
    }


}
