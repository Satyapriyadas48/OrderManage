package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepo;
import com.example.demo.serviceImpl.OrderServiveImpl;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiveImplTest {

	@InjectMocks
	OrderServiveImpl orderServiveImpl;
	@Mock
	OrderRepo orderRepo;

	@Test
	public void testGetOrderbyPin() {
		int pin = 90000;

		when(orderRepo.findByPin(pin)).thenReturn(new ArrayList<Order>());
		when(orderRepo.count()).thenReturn(4l);

		List<Order> list = orderServiveImpl.getOrderbyPin(pin);
		assertEquals(0, list.size());
		assertEquals(4l, orderRepo.count());

	}

//	@Test
//	public void testGetOrderbyId() {
//		int id = 90000;
//		Optional<Order> orderOptional = Optional.empty();
//		when(orderRepo.findById(id)).thenReturn(orderOptional);
//		// when(orderRepo.count()).thenReturn(4l);
//
//		//Optional<Order> list = orderServiveImpl.getOrderbyId(id);
//		assertNotNull(orderServiveImpl);
//	}

	@Test
	public void testGetOrderbyId() {
		int id = 90;
		
		Optional<Order> order=Optional.of(new Order());
		when(orderRepo.findById(id)).thenReturn(order);
		
		
		orderServiveImpl.getOrderbyId(id);
		//assertEquals(list, "null values");
		

		//Exception e=assertThrows(RuntimeException.class,()->{
			//orderServiveImpl.getOrderbyId(id);
			//assertNotNull(orderRepo);
			
		//});
	}
	@Test
	public void testGetOrderbyIdWhenNull() {
		int id = 90;
		
		//Optional<Order> order=Optional.empty();
		Order obj=null;
		when(orderRepo.findById(id).get()).thenReturn(null);
		// when(orderRepo.count()).thenReturn(4l);
		
		//assertEquals(null,obj);
		
		orderServiveImpl.getOrderbyId(id);
		assertEquals(new RuntimeException(),null);
		

		//Exception e=assertThrows(RuntimeException.class,()->{
			//orderServiveImpl.getOrderbyId(id);
			//assertNotNull(orderRepo);
			
		//});
	}
	
}
