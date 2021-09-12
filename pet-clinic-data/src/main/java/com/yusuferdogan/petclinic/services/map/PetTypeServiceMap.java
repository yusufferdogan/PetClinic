package com.yusuferdogan.petclinic.services.map;

import com.yusuferdogan.petclinic.model.Pet;
import com.yusuferdogan.petclinic.model.PetType;
import com.yusuferdogan.petclinic.services.PetTypeService;

import java.util.Set;

public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findByID(Long aLong) {
        return super.findById(aLong);
    }
}
