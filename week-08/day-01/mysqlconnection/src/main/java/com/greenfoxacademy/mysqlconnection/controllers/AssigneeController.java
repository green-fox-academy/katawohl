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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo/assignee")
public class AssigneeController {
    private final TodoServiceImpl todoService;
    private final AssigneeServiceImpl assigneeService;

    @Autowired
    public AssigneeController(TodoServiceImpl todoService, AssigneeServiceImpl assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping("/add")
    public String showAddAssigneePage() {
        return "addassignee";
    }

    @PostMapping("/add")
    public String addNewAssignee(@ModelAttribute Assignee assignee) {
        assigneeService.addAssignee(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable(name = "id") Long id) {
        assigneeService.deleteById(id);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/{id}/edit")
    public String showEditPage(@PathVariable(name = "id") long id, Model model) {
        Assignee assignee = assigneeService.findById(id);

        model.addAttribute("found", assignee != null);
        model.addAttribute("assignee", assignee);
        return "editassignee";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@ModelAttribute Assignee assignee) {
        assigneeService.addAssignee(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/{id}/todos")
    public String showAssigneesTodos(@PathVariable(name = "id") long id, Model model) {
        model.addAttribute("todos", assigneeService.findById(id).getTodoList());
        return "todolist";
    }
}
