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
		return "Welcome to our back-end engeneer chalenge, https://github.com/macuacuafrancisco/country-backend/blob/main/README.md ";
	}


}
