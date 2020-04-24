package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  private List<Fox> foxes;

  public FoxService(){
    foxes = new ArrayList<>();
    foxes.add(new Fox("Juli"));
    this.foxes = foxes;
  }

  public List<Fox> getFoxes(){
    return foxes;
  }

  public void addFox(Fox fox){
    foxes.add(fox);
  }

  public Fox getFoxByName(String name){
    for (Fox fox:foxes){
      if (fox.getName().equals(name)){
        return fox;
      }
    } return null;
  }
}
