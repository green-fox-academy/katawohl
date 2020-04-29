package com.greenfoxacademy.mysqlconnection.repository;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByTitleContains(String title);
}