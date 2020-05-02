package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import com.greenfoxacademy.mysqlconnection.models.Todo;
import java.util.List;

public interface TodoService {

  void addTodo(Todo todo);
  List<Todo> getTodos();
  Todo findById(long id);
  List<Todo> findByTitle(String title);
  void deleteById(long id);
  void addAssigneeToTodo(Assignee assignee, Todo todo);

}
