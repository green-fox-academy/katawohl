package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.services.TodoServiceImpl;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoServiceImpl todoService;

  @Autowired
  public TodoController(TodoServiceImpl todoService) {
    this.todoService = todoService;
  }

  @GetMapping( {"/", "/list"})
  public String list(@RequestParam(value = "isDone", required = false) Boolean isDone,
                     Model model) {
    List<Todo> todoList = todoService.listDoneTodos(isDone);

    model.addAttribute("todos", todoList);
    model.addAttribute("todo", new Todo());
    return "todolist";
  }

  @GetMapping("/add")
  public String showAddPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addpage";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable(name = "id") long id) {
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEditPage(@PathVariable(name = "id") long id, Model model) {
    Todo todo = todoService.findById(id);
    model.addAttribute("todo", todo);
    return "editpage";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo, String title, Boolean urgent, Boolean done) {
    todoService.setNewTitle(todo, title);
    todoService.setNewUrgent(todo, urgent);
    todoService.setNewDone(todo, done);

    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }

}