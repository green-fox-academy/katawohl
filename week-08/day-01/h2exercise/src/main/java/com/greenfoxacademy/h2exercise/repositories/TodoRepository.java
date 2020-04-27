package com.greenfoxacademy.h2exercise.repositories;

import com.greenfoxacademy.h2exercise.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
