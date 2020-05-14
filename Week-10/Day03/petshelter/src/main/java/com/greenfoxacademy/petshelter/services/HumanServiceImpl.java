package com.greenfoxacademy.petshelter.services;

import com.greenfoxacademy.petshelter.models.Human;
import com.greenfoxacademy.petshelter.repositories.HumanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService {

  private HumanRepository humanRepository;

  @Autowired
  public HumanServiceImpl(HumanRepository humanRepository) {
    this.humanRepository = humanRepository;
  }

  @Override
  public List<Human> listAllHumans() {
    return humanRepository.findAll();
  }
}
