package com.greenfoxacademy.petshelter.services;

import com.greenfoxacademy.petshelter.models.Human;
import com.greenfoxacademy.petshelter.repositories.HumanRepository;

import java.util.List;
import java.util.Optional;

import javassist.NotFoundException;
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

    @Override
    public void addHuman(Human human) {
        humanRepository.save(human);
    }

    @Override
    public void deleteHumanById(Long id) throws NotFoundException {
        Optional<Human> humanOptional = humanRepository.findById(id);
        if (humanOptional.isPresent()){
            humanRepository.delete(humanOptional.get());
        } else {
            throw new NotFoundException("Human by the given ID does not exist");
        }

    }

    @Override
    public Human findById(Long id) {
        Human human = humanRepository.findById(id).orElse(null);
        return human;
    }
}
