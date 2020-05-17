package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;

public interface LinkService {

    void addLink(Link link);
    void generateSecretCode(Link link);
    Link findByAlias(String alias);
}
