package com.example.mmg_pet_clinic.services.map;

import java.util.Set;

import com.example.mmg_pet_clinic.model.Owner;
import com.example.mmg_pet_clinic.services.CrudServices;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudServices<Owner,Long>{

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
		
	}

	

	
	
}