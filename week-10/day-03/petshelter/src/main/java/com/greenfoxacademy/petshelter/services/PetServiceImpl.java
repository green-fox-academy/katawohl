package com.greenfoxacademy.petshelter.services;

import com.greenfoxacademy.petshelter.models.Pet;
import com.greenfoxacademy.petshelter.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    PetRepository petRepository;

    @Autowired
    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> listAllPets() {
        return petRepository.findAll();
    }
}
