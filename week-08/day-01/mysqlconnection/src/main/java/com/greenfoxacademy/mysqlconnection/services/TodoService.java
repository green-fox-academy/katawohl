package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo){
    todoRepository.save(todo);
  }

  public List<Todo> getTodos(){
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);

    return todos;
  }
}
