package com.francisco.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.francisco.backend.entity.CountryEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface ICountryRepository extends JpaRepository<CountryEntity, Long> {

	@Query("select c from COUNTRY c order by :pSort ")
	List<CountryEntity> findOrdered(@Param("pSort") String sort);

}