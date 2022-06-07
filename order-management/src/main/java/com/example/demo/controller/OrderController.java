package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Order;
import com.example.demo.entity.Status;
import com.example.demo.service.OrderService;
import com.example.demo.serviceImpl.OrderServiveImpl;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	public Status getOrderStatus() {
		OrderService orderService=new OrderServiveImpl();
		Status status=null;
		try {
			status = orderService.getOrderStatus();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	
	@GetMapping("/{id}")
	Optional<Order> getOrderbyId(@Validated @PathVariable int id) {
		Optional<Order> order = orderService.getOrderbyId(id);
		return order;
	}
	

	@GetMapping("/{pin}")
	Optional<Order> getOrderbyPin(@Validated @PathVariable int pin) {
		Optional<Order> order = orderService.getOrderbyPin(pin);
		return order;
	}

	

}
