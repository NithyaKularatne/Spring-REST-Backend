package com.countries.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id          //to treat ID as the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String countryName;
	private String continent;
	private String president;
	
	public Country() {
	}
	
	public Country(String countryName, String continent, String president) {
		super();
		this.countryName = countryName;
		this.continent = continent;
		this.president = president;
	}
	
	public int getId() {
		return id;
	}

	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	
	
	
}
