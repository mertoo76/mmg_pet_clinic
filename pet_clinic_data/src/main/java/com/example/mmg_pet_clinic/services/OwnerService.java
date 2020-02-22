package com.example.mmg_pet_clinic.services;

import java.util.Set;

import com.example.mmg_pet_clinic.model.Owner;

public interface OwnerService extends CrudServices<Owner,Long> {
	
	Owner findByLastName(String lastName);
	
}
