package com.yusuferdogan.petclinic.bootstrap;

import com.yusuferdogan.petclinic.model.Owner;
import com.yusuferdogan.petclinic.model.Vet;
import com.yusuferdogan.petclinic.services.OwnerService;
import com.yusuferdogan.petclinic.services.VetService;
import com.yusuferdogan.petclinic.services.map.OwnerServiceMap;
import com.yusuferdogan.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("fiona");
        owner2.setLastName("gallantry");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("vet1-first");
        vet1.setLastName("vet1-last");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("vet2-first");
        vet1.setLastName("vet2-last");

        vetService.save(vet2);

        System.out.println("Loaded vets");

    }
}
