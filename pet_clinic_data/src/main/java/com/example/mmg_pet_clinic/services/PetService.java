package com.example.mmg_pet_clinic.services;

import java.util.Set;


import com.example.mmg_pet_clinic.model.Pet;

public interface PetService {

	
	Pet findById(long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
