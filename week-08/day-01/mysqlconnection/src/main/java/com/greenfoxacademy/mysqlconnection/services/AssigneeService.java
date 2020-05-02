package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.models.Assignee;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {
  List<Assignee> returnAllAssignee();
  void addAssignee(Assignee assignee);
  Assignee findById(long id);
}
