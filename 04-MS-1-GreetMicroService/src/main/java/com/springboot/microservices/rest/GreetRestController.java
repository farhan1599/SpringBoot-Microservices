package com.springboot.microservices.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.microservices.WelcomeApiClient;

@RestController
public class GreetRestController {

//==================InterService Communication using FeignClient========================

	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = "Good Morning,";
		String welcomeMsg = welcomeApiClient.invokeWelcomeMsg();
		return greetMsg.concat(welcomeMsg);
	}

	/*
	 * @GetMapping("/greet") public String getGreetMsg() { String
	 * greetMsg="Good Morning"; return greetMsg; }
	 */

}
