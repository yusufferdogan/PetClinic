package com.yusuferdogan.petclinic.services;

import com.yusuferdogan.petclinic.model.Owner;
import com.yusuferdogan.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
