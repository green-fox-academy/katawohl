package com.greenfox.aliaser.services;

import com.greenfox.aliaser.models.Link;
import com.greenfox.aliaser.repositories.LinkRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void listAllLInksShouldReturnCorrectLinks() {
        LinkRepository repository = Mockito.mock(LinkRepository.class);

        LinkServiceImpl service = new LinkServiceImpl(repository);

        List<Link> links = Arrays.asList(
                new Link(),
                new Link()
        );

        Mockito.when(repository.findAll()).thenReturn(links);

        List<Link> testLinks = service.listAllLinks();

        Assert.assertEquals(testLinks, links);
    }
}