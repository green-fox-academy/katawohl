package com.greenfoxacademy.mysqlconnection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private Boolean isUrgent = false;
  private Boolean isDone = false;

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public Todo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Boolean isIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(Boolean urgent) {
    this.isUrgent = urgent;
  }

  public Boolean isIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean done) {
    this.isDone = done;
  }
}
