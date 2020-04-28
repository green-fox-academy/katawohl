package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import java.util.List;

public interface TodoService {

  void addTodo(Todo todo);
  List<Todo> getTodos();
}
