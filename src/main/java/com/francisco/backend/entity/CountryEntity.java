package com.francisco.backend.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@Entity(name = "COUNTRY")
public class CountryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5679200442040229605L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "CAPITAL", nullable = false)
	private String capital;

	@ManyToOne
	@JoinColumn(name = "SUB_REGION_ID", nullable = false)
	private SubRegionEntity subRegion;

	@Column(name = "AREA", nullable = false, unique = true)
	private String area;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public SubRegionEntity getSubRegion() {
		return subRegion;
	}

	public void setSubRegion(SubRegionEntity subRegion) {
		this.subRegion = subRegion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
