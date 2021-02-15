package com.countries.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countries.crud.model.Country;
import com.countries.crud.repository.CrudRepository;

@Service
public class CrudService {

	@Autowired
	private CrudRepository repo;

	public List<Country> fetchCountryList(){
		return repo.findAll();
	}
	public Country saveCountryInDb(Country country) {
		return repo.save(country);
	}
	
	public Boolean updateCountryInDb(Country country) {
		int country_id = country.getId();
		
		Optional<Country> country_db = this.repo.findById(country_id);
		
		if(country_db.isPresent()) {
			
			Country c_update = country_db.get();
			c_update.setCountryName(country.getCountryName());
			c_update.setContinent(country.getContinent());
			c_update.setPresident(country.getPresident());
			repo.save(c_update);
			return true;

		}
		else {
			return false;
		}
				
	}
	
	public Optional<Country> fetchCountryById(int id) {
		return repo.findById(id);
	}
	
	public Boolean deleteCountryById(int id) {
		
		boolean result;
		try {
			repo.deleteById(id);
			result = true;
		} catch (Exception e){
			result = false;
		}
		return result;
	}
}
