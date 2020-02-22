package com.example.mmg_pet_clinic.services;

import java.util.Set;

import com.example.mmg_pet_clinic.model.Vet;


public interface VetService {

	Vet findById(long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
