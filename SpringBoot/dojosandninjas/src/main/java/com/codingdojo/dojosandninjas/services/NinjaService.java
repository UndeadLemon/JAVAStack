package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo=ninjaRepo;
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> getAll(){
		return ninjaRepo.findAll();
	}
	
	public Ninja findOne(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}else {
			return null;
		}
	}
	public Ninja update(Long id, String firstName, String lastName, Dojo dojo, int age) {
		Ninja ninjaToBeUpdated = new Ninja(id, firstName, lastName, dojo, age);
		return ninjaRepo.save(ninjaToBeUpdated);
	}
	
	public String deleteById(Long id) {
		ninjaRepo.deleteById(id);;
		return "You deleted the record with an id of: " + id;
	}
}
