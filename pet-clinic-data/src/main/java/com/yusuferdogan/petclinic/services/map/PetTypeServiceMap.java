package com.yusuferdogan.petclinic.services.map;

import com.yusuferdogan.petclinic.model.Pet;
import com.yusuferdogan.petclinic.model.PetType;
import com.yusuferdogan.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
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
