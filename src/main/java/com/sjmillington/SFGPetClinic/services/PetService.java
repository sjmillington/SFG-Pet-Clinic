package com.sjmillington.SFGPetClinic.services;

import com.sjmillington.SFGPetClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
