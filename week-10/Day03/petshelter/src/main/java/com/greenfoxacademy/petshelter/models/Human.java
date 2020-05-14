package com.greenfoxacademy.petshelter.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Human {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;

  @JsonIgnore
  private int age;

  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "human", fetch = FetchType.EAGER)
  private List<Pet> petlist;

  public Human() {
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Pet> getPetlist() {
    return petlist;
  }

  public void setPetlist(List<Pet> petlist) {
    this.petlist = petlist;
  }
}
