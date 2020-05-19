package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;

import java.util.List;

public interface LinkService {

    void addLink(Link link);
    void generateSecretCode(Link link);
    Link findByAlias(String alias);
    void incrementLinkHitCount(Link link);
    List<Link> listAllLinks();
    Link findBySecretCode(String secretCode);
    void deleteLink(Link link);
    Link findById(long id);
    Boolean ifAliasAlreadyExists(String alias);
}
