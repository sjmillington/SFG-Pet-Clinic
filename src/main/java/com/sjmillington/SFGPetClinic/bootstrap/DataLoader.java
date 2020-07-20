package com.sjmillington.SFGPetClinic.bootstrap;

import com.sjmillington.SFGPetClinic.model.Owner;
import com.sjmillington.SFGPetClinic.model.Vet;
import com.sjmillington.SFGPetClinic.services.OwnerService;
import com.sjmillington.SFGPetClinic.services.VetService;
import com.sjmillington.SFGPetClinic.services.map.OwnerMapService;
import com.sjmillington.SFGPetClinic.services.map.VetMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner o = new Owner();
        o.setId(1L);
        o.setFirstName("Michael");
        o.setLastName("Weston");

        ownerService.save(o);

        o.setId(2L);
        o.setFirstName("Fiona");
        o.setLastName("Gleanne");

        ownerService.save(o);

        System.out.println("Loaded owners...");

        Vet vet = new Vet();

        vet.setId(1L);
        vet.setFirstName("Bill");
        vet.setLastName("Wheaton");

        vetService.save(vet);

        vet.setId(2L);
        vet.setLastName("Ono");
        vet.setFirstName("Yoko");

        vetService.save(vet);

        System.out.println("Loaded vets..");


    }
}
