package com.yusuferdogan.petclinic.bootstrap;
import com.yusuferdogan.petclinic.model.Owner;
import com.yusuferdogan.petclinic.model.PetType;
import com.yusuferdogan.petclinic.model.Vet;
import com.yusuferdogan.petclinic.services.OwnerService;
import com.yusuferdogan.petclinic.services.PetTypeService;
import com.yusuferdogan.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("fiona");
        owner2.setLastName("gallantry");

        ownerService.save(owner2);

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
