package com.greenfox.aliaser.repositories;

import com.greenfox.aliaser.models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    Link findByAlias(String alias);

    Optional<Link> findBySecretCode(String secretCode);

    List<Link> findAll();
}
