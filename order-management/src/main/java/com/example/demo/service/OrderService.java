package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.entity.Status;


@Service
public interface OrderService {

	public Status getOrderStatus();

	public Optional<Order> getOrderbyId(int id);

	public Optional<Order> getOrderbyPin(int pin);

}
