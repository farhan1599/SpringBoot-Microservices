package com.springboot.microservices.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestContoller {

//==============================Main logic method====================================

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name ="circuit_breaker")
	public String getDataFromRedis() {
		System.out.println("***redis() method called***");
		// TODO:logic to fetch data from redis server
		int i = 10 / 0; // ArithmeticException
		return "Retrieved Data From Redis";

	}

//=======================Fallback logic method====================================

	public String getDataFromDB(Throwable throwable) {
		System.out.println("*** db() method called.. ***");
		return "Retrieved Data From Database";
	}

}
