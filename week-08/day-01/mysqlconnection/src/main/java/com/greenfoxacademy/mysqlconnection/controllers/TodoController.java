package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.services.AssigneeServiceImpl;
import com.greenfoxacademy.mysqlconnection.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoServiceImpl todoService;
  private final AssigneeServiceImpl assigneeService;

  @Autowired
  public TodoController(TodoServiceImpl todoService, AssigneeServiceImpl assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping( {"/", "/list"})
  public String list(@RequestParam(value = "isDone", required = false) Boolean isDone,
                     Model model) {
    model.addAttribute("todos", todoService.listDoneTodos(isDone));
    model.addAttribute("todo", new Todo());
    return "todolist";
  }

  @GetMapping("/assignees")
  public String showAddAssigneePage(Model model) {
    model.addAttribute("assignees", assigneeService.returnAllAssignee());
    return "listofass";
  }

  @GetMapping("/add")
  public String showAddPage() {
    return "addtodopage";
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
    model.addAttribute("todo", todoService.findById(id));
    model.addAttribute("assignees", assigneeService.returnAllAssignee());
    return "edittodopage";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo, long assigneeId) {
    todoService.addAssigneeToTodo(assigneeService.findById(assigneeId), todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/search{searchTitle}")
  public String searchForTodo(@PathVariable(name = "searchTitle") String title, Model model){
    model.addAttribute("todos", todoService.findByTitle(title));
    return "searchresults";
  }

}