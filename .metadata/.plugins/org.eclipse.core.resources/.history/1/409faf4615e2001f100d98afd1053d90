package com.springboot.microservices.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope 
public class GreetRestController {

	@Value("${msg}")
	String msg;

	@GetMapping("/")
	public String getGreetMsg() {
		return msg;
	}

}
