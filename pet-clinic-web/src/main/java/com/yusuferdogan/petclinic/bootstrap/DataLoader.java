package com.yusuferdogan.petclinic.bootstrap;
import com.yusuferdogan.petclinic.model.Owner;
import com.yusuferdogan.petclinic.model.Pet;
import com.yusuferdogan.petclinic.model.PetType;
import com.yusuferdogan.petclinic.model.Vet;
import com.yusuferdogan.petclinic.services.OwnerService;
import com.yusuferdogan.petclinic.services.PetTypeService;
import com.yusuferdogan.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("california");
        owner1.setCity("California-City");
        owner1.setTelephone("11111111111111111111111111");
        ownerService.save(owner1);

        Pet michealsPet = new Pet();
        michealsPet.setName("Rosco");
        michealsPet.setPetType(savedDogType);
        michealsPet.setBirthDate(LocalDate.of(2021,7,13));
        michealsPet.setOwner(owner1);
        owner1.getPets().add(michealsPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("fiona");
        owner2.setLastName("gallantry");
        owner2.setAddress("Miami");
        owner2.setCity("Miami-City");
        owner2.setTelephone("22222222222222222222222222");
        ownerService.save(owner2);

        Pet fionasPet = new Pet();
        fionasPet.setName("pamuk");
        fionasPet.setPetType(savedCatType);
        fionasPet.setBirthDate(LocalDate.of(2021,7,13));
        fionasPet.setOwner(owner2);
        owner2.getPets().add(fionasPet);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("vet1-first");
        vet1.setLastName("vet1-last");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2-first");
        vet2.setLastName("vet2-last");

        vetService.save(vet2);

        System.out.println("Loaded vets");

    }
}
