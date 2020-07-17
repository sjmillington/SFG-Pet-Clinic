package com.sjmillington.SFGPetClinic.services;

import com.sjmillington.SFGPetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
