package com.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Order;
import com.springboot.service.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
		String msg= orderService.addMsg(order);
		return msg;
	}
}
