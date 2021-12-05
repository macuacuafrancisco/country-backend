package com.francisco.backend.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Francisco da Conceição Alberto Macuácua
 */
@RestController
@RequestMapping("/")
public class HomeWS {

	@GetMapping("/")
	public String root() {
		return "Welcome, use as example this URI http://localhost:8080/api/v1/country/ ";
	}

	@GetMapping("/api")
	public String api() {
		return "Welcome, use as example this URI http://localhost:8080/api/v1/country/ ";
	}

	@GetMapping("/api/v1")
	public String v1() {
		return "Welcome, use as example this URI http://localhost:8080/api/v1/country/ ";
	}

}
