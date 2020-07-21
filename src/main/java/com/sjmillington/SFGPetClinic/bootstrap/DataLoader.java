package com.sjmillington.SFGPetClinic.bootstrap;

import com.sjmillington.SFGPetClinic.model.Owner;
import com.sjmillington.SFGPetClinic.model.Vet;
import com.sjmillington.SFGPetClinic.services.OwnerService;
import com.sjmillington.SFGPetClinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o = new Owner();
        o.setFirstName("Michael");
        o.setLastName("Weston");
        ownerService.save(o);
        Owner a = new Owner();

        a.setFirstName("Fiona");
        a.setLastName("Gleanne");

        ownerService.save(a);

        System.out.println("Loaded owners...");

        Vet vet = new Vet();

        vet.setFirstName("Bill");
        vet.setLastName("Wheaton");

        vetService.save(vet);
        Vet vet1 = new Vet();
        vet1.setLastName("Ono");
        vet1.setFirstName("Yoko");

        vetService.save(vet1);

        System.out.println("Loaded vets..");


    }
}
