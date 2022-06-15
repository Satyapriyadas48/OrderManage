package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.entity.Status;


@Service
public interface OrderService {

	//public Status getOrderStatus();

	public Order getOrderbyId(int id);

	public List<Order> getOrderbyPin(int pin);

}
