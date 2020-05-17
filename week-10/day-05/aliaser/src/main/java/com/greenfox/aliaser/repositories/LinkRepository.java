package com.greenfox.aliaser.repositories;

import com.greenfox.aliaser.models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {
    Optional<Link> findByAlias(String alias);
}
