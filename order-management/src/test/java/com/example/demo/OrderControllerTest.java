package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.example.demo.controller.OrderController;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import com.example.demo.serviceImpl.OrderServiveImpl;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

//	@Test
//	public void getOrderByIdTest() {
//		int id = 90;
//		Order order = new Order();
//
//		OrderController orderController = new OrderController();
//		OrderService orderService = new OrderServiveImpl();
//		orderController.setOrderService(orderService);
//		Optional<Order> orderOptional = Optional.of(order);
//    	when(orderService.getOrderbyId(id)).thenReturn(orderOptional);
//
//		orderController.getOrderbyId(id);
//
//		//assertNotNull(orderController);
//	}

	
	
	@InjectMocks
	OrderController orderController;
	@Mock
	OrderServiveImpl orderServiveImpl;
	
	@Test
	public void getOrderbyIdTest() {
		int id=20;
		Order order=new Order();
		when(orderServiveImpl.getOrderbyId(id)).thenReturn(order);
		
//		ResponseEntity<Object> list = 
		orderController.getOrderbyId(id);
	    //assertEquals(null, orderController.getOrderbyId(id));
		
		
	}
	
	@Test
	public void getOrderbyIdTestNull() {
		Integer id=9;
		Order order=new Order();
		when(orderServiveImpl.getOrderbyId(id)).thenReturn(null);
		
//		ResponseEntity<Object> list = 
		orderController.getOrderbyId(id);
	   // assertEquals(null, orderController.getOrderbyId(id));
		
		
	}
	

	@Test
	public void getOrderbyPinTest() {
		int pin=20;
	 	List<Order> order=new ArrayList();
		when(orderServiveImpl.getOrderbyPin(pin)).thenReturn(order);
		
//		ResponseEntity<Object> list = 
		orderController.getOrderbyPin(pin);
	    //assertEquals(null, orderController.getOrderbyId(id));
		
		
	}
}
