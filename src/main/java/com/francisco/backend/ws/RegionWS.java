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

import com.francisco.backend.entity.RegionEntity;
import com.francisco.backend.repository.IRegionRepository;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@RestController
@RequestMapping("/api/v1/region")
public class RegionWS {
	@Autowired
	private IRegionRepository regionRepository;

	@PostMapping
	public RegionEntity create(RegionEntity region) {
		return regionRepository.save(region);
	}

	@GetMapping
	public List<RegionEntity> findAll() {
		return (List<RegionEntity>) regionRepository.findAll();
	}

	@GetMapping("/{id}")
	public RegionEntity find(@PathVariable Long id) {
		return regionRepository.findById(id).get();
	}

	@PutMapping("/{id}")
	public RegionEntity update(@RequestBody RegionEntity region, @PathVariable Long id) {
		RegionEntity regionDB = this.find(id);
		if (region.getName() != null)
			regionDB.setName(region.getName());

		return regionRepository.save(regionDB);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		regionRepository.deleteById(id);
	}
}
