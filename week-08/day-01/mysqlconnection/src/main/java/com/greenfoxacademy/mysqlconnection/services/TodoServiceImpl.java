package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
  
  public List<Todo> listDoneTodos(Boolean isDone){
    List<Todo> todos;
    
    if (isDone != null){
      todos = this.getTodos().stream()
          .filter(todo -> todo.getDone() == isDone)
          .collect(Collectors.toList());
    } else  {
      todos = this.getTodos();
    }
    
    return todos;
  }

  @Override
  public void addTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public void delete(Todo todo) {
    todoRepository.delete(todo);
  }

  @Override
  public Todo findById(long id) {
    Optional<Todo> optionalTodo = todoRepository.findById(id);
    Todo todo;

    todo = optionalTodo.orElse(null);

    return todo;
  }

  public void deleteById(long id) {
    Optional<Todo> todoToDelete = todoRepository.findById(id);
    todoToDelete.ifPresent(todo -> todoRepository.delete(todo));
  }
}
