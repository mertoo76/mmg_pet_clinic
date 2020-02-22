package com.example.mmg_pet_clinic.services;

import java.util.Set;

import com.example.mmg_pet_clinic.model.Owner;

public interface OwnerService {

	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	
	Owner findByLastName(String lastName);
	
}
