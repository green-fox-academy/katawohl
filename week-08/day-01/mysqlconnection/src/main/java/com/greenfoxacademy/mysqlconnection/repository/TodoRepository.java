package com.greenfoxacademy.mysqlconnection.repository;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  @Query(value = "SELECT * FROM todos WHERE title LIKE %:searchString%", nativeQuery = true)
  List<Todo> findTodoByTitleNative(String searchString);
}