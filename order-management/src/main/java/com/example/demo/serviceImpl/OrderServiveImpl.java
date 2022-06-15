package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
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
//
//	@Override
//	public Status getOrderStatus() {

//		return null;
//	}

	@Override
	public Order getOrderbyId(int id) {
		
		Order order = orderRepo.findById(id).get();
		
		if(order==null) {
			throw new RuntimeException("unable to fetch the object from database");
		}
		
		return order;
	}

	@Override
	public List<Order> getOrderbyPin(int pin) {
		// TODO Auto-generated method stub
		// return orderRepo.findByPin(pin);
		
		List<Order> l = new ArrayList<Order>();
		l = orderRepo.findByPin(pin);
		
		//long count=orderRepo.count();
		return l;
	}

}
