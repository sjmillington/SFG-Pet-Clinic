package com.sjmillington.SFGPetClinic.services.map;

import com.sjmillington.SFGPetClinic.model.Vet;
import com.sjmillington.SFGPetClinic.services.CrudService;
import com.sjmillington.SFGPetClinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
