package com.countries.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.countries.crud.model.Country;

public interface CrudRepository extends JpaRepository<Country, Integer> {

}
