package com.greenfoxacademy.h2exercise.controllers;

import com.greenfoxacademy.h2exercise.models.Todo;
import com.greenfoxacademy.h2exercise.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping( {"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = new ArrayList<>();

    todoRepository.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todolist";
  }
}
