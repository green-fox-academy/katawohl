package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repository.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements AssigneeService {
  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> returnAllAssignee() {
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignees::add);
    return assignees;
  }

  @Override
  public void addAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

   @Override
  public Assignee findByName(String name) {
    Assignee assignee = assigneeRepository.findByName(name);

    return assignee;
  }

  @Override
  public Assignee findById(long id) {
    Optional<Assignee> optionalAssignee = assigneeRepository.findById(id);

    Assignee assignee = optionalAssignee.orElse(null);
    return assignee;
  }

  public void deleteById(long id) {
    Optional<Assignee> optionalAssignee = assigneeRepository.findById(id);
    optionalAssignee.ifPresent(assignee -> assigneeRepository.delete(assignee));
  }
}
