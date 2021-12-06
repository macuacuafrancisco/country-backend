package com.francisco.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.backend.entity.RegionEntity;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@Repository
public interface IRegionRepository extends JpaRepository<RegionEntity, Long> {

}