package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.services.AssigneeServiceImpl;
import com.greenfoxacademy.mysqlconnection.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
  private final TodoServiceImpl todoService;
  private final AssigneeServiceImpl assigneeService;

  @Autowired
  public AssigneeController(TodoServiceImpl todoService, AssigneeServiceImpl assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/add")
  public String showAddAssigneePage(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addassignee";
  }

  @PostMapping("/add")
  public String addNewAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/todo/list";
  }
}
