package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    }

    @Override
    public Link findByAlias(String alias) {
        Link link = linkRepository.findByAlias(alias).orElse(null);

        return link;
    }

    public void incrementLinkHitCount(Link link) {
        link.incrementHitCount();
        linkRepository.save(link);
    }

    @Override
    public List<Link> listAllLInks() {
        return linkRepository.findAll();
    }

    @Override
    public Link findBySecretCode(String secretCode) {
        return linkRepository.findBySecretCode(secretCode).orElse(null);
    }

    @Override
    public void deleteLink(Link link) {
        linkRepository.delete(link);
    }

    @Override
    public Link findById(long id) {
        return linkRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean ifAliasAlreadyExists(String alias) {
        return null;
    }

}
