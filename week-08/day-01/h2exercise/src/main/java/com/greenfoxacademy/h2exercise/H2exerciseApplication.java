package com.greenfoxacademy.h2exercise;

import com.greenfoxacademy.h2exercise.models.Todo;
import com.greenfoxacademy.h2exercise.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2exerciseApplication implements CommandLineRunner {
  private final TodoRepository todoRepository;

  @Autowired
  public H2exerciseApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(H2exerciseApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    Todo todo1 = new Todo();
    todo1.setTitle("Jump around");
    Todo todo2 = new Todo();
    todo2.setTitle("Get milk");
    Todo todo3 = new Todo();
    todo3.setTitle("Pet a dog");
    todoRepository.save(todo1);
    todoRepository.save(todo2);
    todoRepository.save(todo3);
  }
}
