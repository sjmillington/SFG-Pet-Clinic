package com.sjmillington.SFGPetClinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Pet extends BaseEntity {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;
}
