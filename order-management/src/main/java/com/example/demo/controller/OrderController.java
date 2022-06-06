package com.example.demo.controller;

import com.example.demo.entity.Status;
import com.example.demo.service.OrderService;
import com.example.demo.serviceImpl.OrderServiveImpl;

public class OrderController {
	
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
	

}
