package com.greenfoxacademy.mysqlconnection.repository;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, String> {
}
