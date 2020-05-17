package com.greenfoxacademy.petshelter.services;

import com.greenfoxacademy.petshelter.models.Human;
import javassist.NotFoundException;

import java.util.List;

public interface HumanService {

    List<Human> listAllHumans();

    void addHuman(Human human);

    void deleteHumanById(Long id) throws NotFoundException;

    Human findById(Long id);
}
