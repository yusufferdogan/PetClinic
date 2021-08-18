package com.yusuferdogan.petclinic.services;

import com.yusuferdogan.petclinic.model.Owner;
import com.yusuferdogan.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
