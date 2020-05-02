package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> listDoneTodos(Boolean isDone) {
    List<Todo> todos;

    if (isDone != null) {
      todos = this.getTodos().stream()
          .filter(todo -> todo.getDone() == isDone)
          .collect(Collectors.toList());
    } else {
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
  public Todo findById(long id) {
    Optional<Todo> optionalTodo = todoRepository.findById(id);
    Todo todo = optionalTodo.orElse(null);

    return todo;
  }

  @Override
  public List<Todo> findByTitle(String title) {
    List<Todo> todos = todoRepository.findTodoByTitleNative(title);
    return todos;
  }

  @Override
  public void deleteById(long id) {
    Optional<Todo> todoToDelete = todoRepository.findById(id);
    todoToDelete.ifPresent(todo -> todoRepository.delete(todo));
  }

  public void setNewTitle(Todo todo, String title) {
    if (title != null) {
      todo.setTitle(title);
    }
  }

  public void setNewUrgent(Todo todo, Boolean urgent) {
    if (urgent != null) {
      todo.setUrgent(urgent);
    } else {
      todo.setUrgent(false);
    }
  }

  public void setNewDone(Todo todo, Boolean done) {
    if (done != null) {
      todo.setDone(done);
    } else {
      todo.setDone(false);
    }
  }
}
