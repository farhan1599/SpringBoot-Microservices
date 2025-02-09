package com.springboot.microservices.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to MicroServices";
		return msg;
	}

//====================load balancing=======================
	/*
	 * @Autowired private Environment environment;
	 * 
	 * @GetMapping("/welcome") public String getWelcomeMsg() { String port =
	 * environment.getProperty("server.port"); String msg =
	 * "Welcome to MicroServices...(" + port + ")";
	 * 
	 * return msg; }
	 */

}
