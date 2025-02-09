package com.springboot.microservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "03-MS-1-WelcomeMicroService")
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokeWelcomeMsg();
	
}
