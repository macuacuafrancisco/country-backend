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

import com.francisco.backend.entity.SubRegionEntity;
import com.francisco.backend.repository.ISubRegionRepository;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@RestController
@RequestMapping("/api/v1/sub-region")
public class SubRegionWS {
	@Autowired
	private ISubRegionRepository subRegionRepository;

	@PostMapping
	public SubRegionEntity create(SubRegionEntity subRegion) {
		return subRegionRepository.save(subRegion);
	}

	@GetMapping
	public List<SubRegionEntity> findAll() {
		return (List<SubRegionEntity>) subRegionRepository.findAll();
	}

	@GetMapping("/{id}")
	public SubRegionEntity find(@PathVariable Long id) {
		return subRegionRepository.findById(id).get();
	}

	@PutMapping("/{id}")
	public SubRegionEntity update(@RequestBody SubRegionEntity subRegion, @PathVariable Long id) {
		SubRegionEntity subRegionDB = this.find(id);
		if (subRegion.getName() != null)
			subRegionDB.setName(subRegion.getName());
		if (subRegion.getRegion() != null)
			subRegionDB.setRegion(subRegion.getRegion());

		return subRegionRepository.save(subRegionDB);

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		subRegionRepository.deleteById(id);
	}
}
