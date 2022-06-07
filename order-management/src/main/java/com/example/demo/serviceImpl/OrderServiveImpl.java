package com.example.demo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.entity.Status;
import com.example.demo.repository.OrderRepo;
import com.example.demo.service.OrderService;

@Service  

public class OrderServiveImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;

	@Override
	public Status getOrderStatus() {

		return null;
	}

	@Override
	public Optional<Order> getOrderbyId(int id) {
		// TODO Auto-generated method stub
		return orderRepo.findById(id);
	}

	@Override
	public Optional<Order> getOrderbyPin(int pin) {
		// TODO Auto-generated method stub
		return orderRepo.findByPin(pin);
	}
	

}
