package com.example.mmg_pet_clinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.mmg_pet_clinic.model.Owner;
import com.example.mmg_pet_clinic.model.Vet;
import com.example.mmg_pet_clinic.services.OwnerService;
import com.example.mmg_pet_clinic.services.VetService;



@Component
public class DataLoader implements CommandLineRunner{

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setFirstName("Micheal");
		owner1.setLastName("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Gleanna");
		
		ownerService.save(owner2);
		
		System.out.println("-------Loaded Owners ------");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Mert");
		vet2.setLastName("Kim");
		
		vetService.save(vet2);
		
		System.out.println("-------Loaded Vet ------");
		
	}

}
