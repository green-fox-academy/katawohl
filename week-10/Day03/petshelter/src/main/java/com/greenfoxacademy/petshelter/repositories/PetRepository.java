package com.greenfoxacademy.petshelter.repositories;

import com.greenfoxacademy.petshelter.models.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Long> {
    List<Pet> findAll();
}
