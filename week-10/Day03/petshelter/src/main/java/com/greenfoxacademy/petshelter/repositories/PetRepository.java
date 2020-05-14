package com.greenfoxacademy.petshelter.repositories;

import com.greenfoxacademy.petshelter.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
