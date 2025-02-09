package com.springboot.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.properties.AppProps;

@RestController
public class MsgRestController {

// we can inject the "App_Properties" to any RestController class based on our requirement
	@Autowired
	private AppProps properties;

	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = properties.getMessages();
		System.out.println(messages); //it'll print the all properties from .yml file
		return messages.get("greet_msg");
		

	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		Map<String, String> messages = properties.getMessages();

		return messages.get("welcome_msg");

	}

}
