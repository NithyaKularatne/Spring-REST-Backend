package com.countries.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.countries.crud.model.Country;
import com.countries.crud.service.CrudService;

@RestController
public class CrudRestController {

	@Autowired
	private CrudService service;
	
	//@RequestMapping(path = "/getCountryList", method=RequestMethod.GET)
	@GetMapping("/getCountryList")
	@CrossOrigin
	public List<Country> fetchCountryList(){
		List<Country> countries = new ArrayList<Country>();
		
		//fetching a list from database
		countries = service.fetchCountryList();
		return countries;
	}
	
	@PostMapping("/addCountry")
	@CrossOrigin
	public Country saveCountry(@RequestBody Country country){
	
		return service.saveCountryInDb(country);
	}
	
	@PutMapping("/updateCountryById/{id}")
	@CrossOrigin
	public ResponseEntity<?>  updateCountry(@RequestBody Country country){
	
		if(service.updateCountryInDb(country))
            return ResponseEntity.ok().body(HttpStatus.OK);
		else {
            return ResponseEntity.ok().body(HttpStatus.NOT_FOUND);

		}
	}
	
	@GetMapping("/getCountryById/{id}")
	@CrossOrigin
	public Country fetchCountryById(@PathVariable int id){
		return service.fetchCountryById(id).get();
		
	}
	
	@DeleteMapping("/deleteCountryById/{id}")
	@CrossOrigin
	public ResponseEntity<?> deleteCountryById(@PathVariable int id){
		
		
		if(service.deleteCountryById(id))
            return ResponseEntity.ok().body(HttpStatus.OK);
		else {
            return ResponseEntity.ok().body(HttpStatus.NOT_FOUND);

		}
		
	}
}
