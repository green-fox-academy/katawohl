package com.greenfoxacademy.mysqlconnection.repository;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  @Query(value = "SELECT * FROM assignees WHERE name = :name", nativeQuery = true)
  Assignee findByName(String name);
}
