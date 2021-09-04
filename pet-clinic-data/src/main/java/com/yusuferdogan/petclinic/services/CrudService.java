package com.yusuferdogan.petclinic.services;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CrudService<T,ID>  {
    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
