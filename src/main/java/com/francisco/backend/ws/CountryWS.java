package com.francisco.backend.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.backend.entity.CountryEntity;
import com.francisco.backend.repository.ICountryRepository;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@RestController
@RequestMapping("/api/v1/countries")
public class CountryWS {
	@Autowired
	private ICountryRepository countryRepository;

	@PostMapping
	public CountryEntity create(CountryEntity country) {
		return countryRepository.save(country);
	}

	@GetMapping
	public List<CountryEntity> findAll() {
		return (List<CountryEntity>) countryRepository.findAll();
	}

	@GetMapping("/{id}")
	public CountryEntity find(@PathVariable Long id) {
		return countryRepository.findById(id).get();
	}

	@PutMapping("/{id}")
	public CountryEntity update(@RequestBody CountryEntity country, @PathVariable Long id) {
		CountryEntity countryDB = this.find(id);
		if (country.getName() != null)
			countryDB.setName(country.getName());
		if (country.getCapital() != null)
			countryDB.setCapital(country.getCapital());
		if (country.getArea() != null)
			countryDB.setArea(country.getArea());
		if (country.getSubRegion() != null)
			countryDB.setSubRegion(country.getSubRegion());

		return countryRepository.save(countryDB);

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		countryRepository.deleteById(id);
	}
	
	@GetMapping("/sort/by/{sort}")
	public List<CountryEntity> findOrdered(@PathVariable String sort) {
		switch (sort) {
		case "name":
			return  countryRepository.findOrderedByName( sort);
		case "capital":
			return  countryRepository.findOrderedCapital( sort);
		case "subRegion":
			return  countryRepository.findOrderedBySubRegion( sort);
		case "region":
			return  countryRepository.findOrderedByRegion( sort);
		case "area":
			return  countryRepository.findOrderedByArea( sort);
		default:
			break;
		}
		return null;		
		
	}
	
}
