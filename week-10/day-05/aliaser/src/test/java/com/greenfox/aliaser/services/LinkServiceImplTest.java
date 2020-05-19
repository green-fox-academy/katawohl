package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.repositories.LinkRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LinkServiceImplTest {

    @Test
    void findByAliasShouldReturnCorrectLink() {
        LinkRepository repository = Mockito.mock(LinkRepository.class);

        LinkServiceImpl service = new LinkServiceImpl(repository);

        Link link = new Link();
        Link link1 = new Link();

        link.setAlias("test");
        link1.setAlias("test1");

        Mockito.when(repository.findByAlias("test")).thenReturn(link);

        Link testLink = service.findByAlias("test");

        Assert.assertEquals(testLink, link);
    }
}