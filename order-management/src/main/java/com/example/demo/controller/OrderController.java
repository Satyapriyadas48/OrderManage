package com.example.demo.controller;

import com.example.demo.entity.Status;
import com.example.demo.service.OrderService;

public class OrderController {
	
	public Status placeOrder() {
		Status status=null;
		try {
			status = OrderService.getOrderStatus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}

}
