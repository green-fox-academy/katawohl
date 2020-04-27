package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repository.TodoRepository;
import com.greenfoxacademy.mysqlconnection.services.TodoService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping( {"/", "/list"})
  public String list(@RequestParam(value = "isDone", required = false) boolean isDone, Model model) {
    List<Todo> todos = todoService.getTodos().stream()
        .filter(Todo::isDone)
        .collect(Collectors.toList());

    List<Todo> todoList;

    if (isDone){
      todoList = todos;
    } else {
      todoList = todoService.getTodos();
    }

    model.addAttribute("todos", todoList);
    model.addAttribute("todo", new Todo());
    return "todolist";
  }

}

