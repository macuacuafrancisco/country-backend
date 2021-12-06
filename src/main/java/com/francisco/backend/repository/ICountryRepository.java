package com.francisco.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.francisco.backend.entity.CountryEntity;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@Repository
public interface ICountryRepository extends JpaRepository<CountryEntity, Long> {

	@Query("select c from COUNTRY c order by name")
	List<CountryEntity> findOrderedByName(@Param("pSort") String sort);

	@Query("select c from COUNTRY c order by capital")
	List<CountryEntity> findOrderedCapital(@Param("pSort") String sort);

	@Query("select c from COUNTRY c order by subRegion")
	List<CountryEntity> findOrderedBySubRegion(@Param("pSort") String sort);

	@Query("select c from COUNTRY c order by subRegion.region")
	List<CountryEntity> findOrderedByRegion(@Param("pSort") String sort);

	@Query("select c from COUNTRY c order by area")
	List<CountryEntity> findOrderedByArea(@Param("pSort") String sort);
}