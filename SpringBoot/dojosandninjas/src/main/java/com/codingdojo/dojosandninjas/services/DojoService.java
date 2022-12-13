package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo=dojoRepo;
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAll(){
		return dojoRepo.findAll();
	}
	
	public Dojo findOne(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	public Dojo update(Long id, String name) {
		Dojo dojoToBeUpdated = new Dojo(id, name);
		return dojoRepo.save(dojoToBeUpdated);
	}
	
	public String deleteById(Long id) {
		dojoRepo.deleteById(id);;
		return "You deleted the record with an id of: " + id;
	}
}
